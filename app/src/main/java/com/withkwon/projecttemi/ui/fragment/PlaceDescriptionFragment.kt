package com.withkwon.projecttemi.ui.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.withkwon.projecttemi.R

class PlaceDescriptionFragment : Fragment() {

    companion object {
        fun newInstance() = PlaceDescriptionFragment()
    }

    private lateinit var viewModel: PlaceDescriptionViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.place_description_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PlaceDescriptionViewModel::class.java)
        // TODO: Use the ViewModel
    }

}