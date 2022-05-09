package com.withkwon.projecttemi.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.withkwon.projecttemi.R
import com.withkwon.projecttemi.databinding.IntroduceSchoolFragmentBinding

class IntroduceSchoolFragment : Fragment() {
    private val binding by lazy { IntroduceSchoolFragmentBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = with(binding) {
        webView.loadUrl("http://gsm.gen.hs.kr/sub/page.php?page_code=info_01")

        return root
    }
}