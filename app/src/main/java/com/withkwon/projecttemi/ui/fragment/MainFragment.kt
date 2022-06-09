package com.withkwon.projecttemi.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.withkwon.projecttemi.R
import com.withkwon.projecttemi.databinding.FragmentMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : Fragment() {

    private val viewModel: MainViewModel by viewModels()
    private val binding by lazy { FragmentMainBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding.fragment = this
        binding.lifecycleOwner= this
        //KioskMode
        viewModel.robot.requestToBeKioskApp()
        viewModel.robot.setKioskModeOn()

        return binding.root
    }

    //학교소개
    fun goSchoolIntroduce(){
        findNavController().navigate(R.id.action_mainFragment_to_introduceSchoolFragment)
    }

    //길안내
    fun goDirectionGuidance(){
        findNavController().navigate(R.id.action_mainFragment_to_placeListFragment)
    }

    //크레딧
    fun goCredit(){
        findNavController().navigate(R.id.action_mainFragment_to_creditFragment)
    }

}