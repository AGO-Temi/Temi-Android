package com.withkwon.projecttemi.ui.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.withkwon.projecttemi.R
import com.withkwon.projecttemi.databinding.MainFragmentBinding
import dagger.hilt.android.AndroidEntryPoint

class MainFragment : Fragment() {


    private val viewModel: MainViewModel by viewModels()
    private val binding by lazy { MainFragmentBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding.fragment = this
        binding.lifecycleOwner= this

        return binding.root
    }

    fun goSchoolIntroduce(){
        findNavController().navigate(R.id.action_mainFragment_to_introduceSchoolFragment)
    }

    fun goDirectionGuidance(){
        findNavController().navigate(R.id.action_mainFragment_to_placeListFragment)
    }

    fun goCredit(){
        findNavController().navigate(R.id.action_mainFragment_to_creditFragment)
    }

}