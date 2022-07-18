package com.withkwon.projecttemi.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.withkwon.projecttemi.databinding.PlaceListItemBinding
import com.withkwon.projecttemi.model.Locations
import com.withkwon.projecttemi.ui.fragment.MainViewModel

class PlaceDescriptionAdapter(viewModel: MainViewModel) :
    RecyclerView.Adapter<PlaceDescriptionAdapter.PlaceViewHolder>() {

    var datalist = mutableListOf<String>()

    private val viewModel = viewModel

    inner class PlaceViewHolder(private val binding: PlaceListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
            binding.placeBtn.text = datalist[position]
            binding.placeBtn.setOnClickListener{
                viewModel.robot.goTo(datalist[position])
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceViewHolder {
        val binding =
            PlaceListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PlaceViewHolder(binding)
    }

    override fun getItemCount(): Int = datalist.size

    override fun onBindViewHolder(holder: PlaceViewHolder, position: Int) {
        holder.bind(position)
    }
}