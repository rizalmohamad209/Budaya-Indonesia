package com.mohamad_rizal.travellin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.mohamad_rizal.travellin.adapters.CategoryAdapter
import com.mohamad_rizal.travellin.adapters.NearestAdapter
import com.mohamad_rizal.travellin.databinding.ActivityMainBinding
import com.mohamad_rizal.travellin.models.Categories
import com.mohamad_rizal.travellin.models.CategoriesData
import com.mohamad_rizal.travellin.models.Nearest
import com.mohamad_rizal.travellin.models.NearestData

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var categoryAdapter: CategoryAdapter
    private lateinit var nearestAdapter : NearestAdapter
    private var listCategory : ArrayList<Categories> = arrayListOf()
    private var listTour : ArrayList<Nearest> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        showCategorytoRV()
        showNearestTour()
    }

    private fun showCategorytoRV(){
        listCategory.addAll(CategoriesData.listCategories)
        categoryAdapter = CategoryAdapter(listCategory, object : CategoryAdapter.OnCategoryClick{
            override fun onListitemClick(category: Categories) {
                startActivity(Intent(this@MainActivity, DetailActivity::class.java ).apply {
                    putExtra("CategoryName", category.categoriesName)
                    putExtra("CategoryImage", category.categoriesImage)
                    putExtra("CategoryDesc", category.categoriesDesc)
                })
            }
        })
        binding.RvCategory.apply {
            val lm = LinearLayoutManager(this@MainActivity)
            lm.orientation = LinearLayoutManager.HORIZONTAL
            adapter = categoryAdapter
            layoutManager = lm
        }
    }

    private fun showNearestTour(){
        listTour.addAll(NearestData.listTour)
        nearestAdapter = NearestAdapter(listTour, object : NearestAdapter.OnTourClick{
            override fun onItemTourClick(nearestTour: Nearest) {
                startActivity(Intent(this@MainActivity, DetailActivity::class.java).apply {
                    putExtra("TourName", nearestTour.tourName)
                    putExtra("TourImage", nearestTour.tourImage)
                    putExtra("TourContent", nearestTour.tourContent)
                })
            }
        })
        binding.RvNearest.apply {
            val lm = GridLayoutManager(this@MainActivity, 2)
            adapter = nearestAdapter
            layoutManager = lm
        }
    }
}