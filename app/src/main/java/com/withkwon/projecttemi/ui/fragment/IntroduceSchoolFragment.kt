package com.withkwon.projecttemi.ui.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.withkwon.projecttemi.R

class IntroduceSchoolFragment : Fragment() {

    companion object {
        fun newInstance() = IntroduceSchoolFragment()
    }

    private lateinit var viewModel: IntroduceSchoolViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.introduce_school_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(IntroduceSchoolViewModel::class.java)
        // TODO: Use the ViewModel
    }

}