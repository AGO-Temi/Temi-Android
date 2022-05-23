package com.withkwon.projecttemi.ui.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.withkwon.projecttemi.databinding.IntroduceSchoolFragmentBinding
import com.withkwon.projecttemi.util.Constants.TAG

class IntroduceSchoolFragment : Fragment() {
    private val binding by lazy { IntroduceSchoolFragmentBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = with(binding) {
        webView.loadUrl("http://gsm.gen.hs.kr/sub/page.php?page_code=info_01")
        webView.setInitialScale(1)
        webView.settings.apply {
            useWideViewPort = true
            loadWithOverviewMode = true
            builtInZoomControls = true
            setSupportZoom(true)
        }
        
        binding.buttonBack.setOnClickListener {
            Log.d(TAG, "onCreateView: ${findNavController().navigateUp()}")
        }

        return root
    }
}