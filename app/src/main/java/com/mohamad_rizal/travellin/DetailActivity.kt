package com.mohamad_rizal.travellin
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.mohamad_rizal.travellin.databinding.ActivityDetailBinding


class DetailActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        showCategoryDetail()
        showNearestTourDetail()
        btnBackClick()
    }

    private fun showCategoryDetail(){
        val categoryName = intent.getStringExtra("CategoryName")
        val categoryImage = intent.getIntExtra("CategoryImage", 0)
        val categoryDesc = intent.getStringExtra("CategoryDesc")

        if (categoryName != null && categoryDesc!=null){
            Glide.with(this)
                .load(categoryImage)
                .into(binding.ImageDetail)

            binding.TitleDetail.text = categoryName
            binding.ContentDetail.text = categoryDesc
        }

    }

    private fun showNearestTourDetail(){
        val tourName = intent.getStringExtra("TourName")
        val tourImage = intent.getIntExtra("TourImage", 0)
        val tourContent = intent.getStringExtra("TourContent")

        if (tourName != null && tourContent != null){
            Glide.with(this)
                .load(tourImage)
                .into(binding.ImageDetail)

            binding.TitleDetail.text = tourName
            binding.ContentDetail.text = tourContent
        }

    }

    private fun btnBackClick(){
        binding.btnBack.setOnClickListener { finish() }
    }

}