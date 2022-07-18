package com.withkwon.projecttemi.ui.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.withkwon.projecttemi.adapter.PlaceDescriptionAdapter
import com.withkwon.projecttemi.databinding.FragmentPlaceDescriptionBinding
import com.withkwon.projecttemi.util.Constants.TAG
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PlaceDescriptionFragment : Fragment() {

    private val viewModel: MainViewModel by viewModels()
    private val binding by lazy { FragmentPlaceDescriptionBinding.inflate(layoutInflater) }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding.fragment = this
        binding.lifecycleOwner = this

        initPlaceRecyclerView()

        return binding.root
    }

    fun initPlaceRecyclerView(){
        val adapter = PlaceDescriptionAdapter(viewModel) //어댑터 객체 만듦
        adapter.datalist = viewModel.robot.locations.toMutableList() //데이터 넣어줌
        binding.placeRecyclerView.adapter=adapter //리사이클러뷰에 어댑터 연결
        binding.placeRecyclerView.layoutManager= LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false) //레이아웃 매니저 연결
    }

    fun goBack() {
        findNavController().navigateUp()
    }

}