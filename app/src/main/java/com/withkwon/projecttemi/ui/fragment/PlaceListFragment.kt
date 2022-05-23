package com.withkwon.projecttemi.ui.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.withkwon.projecttemi.R
import com.withkwon.projecttemi.databinding.PlaceListFragmentBinding

class PlaceListFragment : Fragment() {

   private val binding by lazy { PlaceListFragmentBinding.inflate(layoutInflater) }

    private lateinit var viewModel: PlaceListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding.fragment = this
        binding.lifecycleOwner = this

        return binding.root
    }

   fun goBack(){
       findNavController().navigateUp()
   }

}