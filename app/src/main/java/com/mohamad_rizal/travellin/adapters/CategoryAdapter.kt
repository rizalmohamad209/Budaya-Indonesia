package com.mohamad_rizal.travellin.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mohamad_rizal.travellin.databinding.ListCategoryBinding
import com.mohamad_rizal.travellin.models.Categories

class CategoryAdapter(private val listCateries : ArrayList<Categories>, private val listener : CategoryAdapter.OnCategoryClick) : RecyclerView.Adapter<CategoryAdapter.CategoriesViewholder>() {
    inner class CategoriesViewholder(val binding: ListCategoryBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewholder {
        return CategoriesViewholder(ListCategoryBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: CategoriesViewholder, position: Int) {
        holder.binding.apply {
            Glide.with(holder.itemView)
                .load(listCateries[position].categoriesImage)
                .into(CategoryImage)

            CategoryName.text = listCateries[position].categoriesName
        }
        holder.itemView.setOnClickListener {
            listener.onListitemClick(listCateries[position])
        }
    }

    override fun getItemCount(): Int {
        return listCateries.size
    }

    interface OnCategoryClick{
        fun onListitemClick(category : Categories)
    }
}