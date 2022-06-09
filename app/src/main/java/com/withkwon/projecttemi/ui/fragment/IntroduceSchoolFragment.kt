package com.withkwon.projecttemi.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.withkwon.projecttemi.databinding.FragmentIntroduceSchoolBinding


class IntroduceSchoolFragment : Fragment() {

    private lateinit var viewModel: IntroduceSchoolViewModel
    private val binding by lazy { FragmentIntroduceSchoolBinding.inflate(layoutInflater) }

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