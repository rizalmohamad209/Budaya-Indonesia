package com.mohamad_rizal.travellin.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mohamad_rizal.travellin.models.Nearest
import com.mohamad_rizal.travellin.databinding.ListTourBinding

class NearestAdapter(private val listTour : ArrayList<Nearest>, private val listener : NearestAdapter.OnTourClick) : RecyclerView.Adapter<NearestAdapter.TourViewholder>() {

    inner class TourViewholder(val binding: ListTourBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TourViewholder {
        return TourViewholder(ListTourBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: TourViewholder, position: Int) {
        holder.binding.apply {
            Glide.with(holder.itemView)
                .load(listTour[position].tourImage)
                .into(Tumbnail)

            Title.text = listTour[position].tourName
        }
        holder.itemView.setOnClickListener {
            listener.onItemTourClick(listTour[position])
        }
    }

    override fun getItemCount(): Int {
        return listTour.size
    }

    interface OnTourClick{
        fun onItemTourClick(nearestTour: Nearest)
    }
}