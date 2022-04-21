package com.withkwon.projecttemi.ui.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.withkwon.projecttemi.R

class MovingFragment : Fragment() {

    companion object {
        fun newInstance() = MovingFragment()
    }

    private lateinit var viewModel: MovingViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.moving_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MovingViewModel::class.java)
        // TODO: Use the ViewModel
    }

}