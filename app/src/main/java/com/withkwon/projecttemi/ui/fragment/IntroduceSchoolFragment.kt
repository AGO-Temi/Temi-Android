package com.withkwon.projecttemi.ui.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.withkwon.projecttemi.R
import com.withkwon.projecttemi.databinding.IntroduceSchoolFragmentBinding

class IntroduceSchoolFragment : Fragment() {

    private lateinit var viewModel: IntroduceSchoolViewModel
    private val binding by lazy { IntroduceSchoolFragmentBinding.inflate(layoutInflater) }

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