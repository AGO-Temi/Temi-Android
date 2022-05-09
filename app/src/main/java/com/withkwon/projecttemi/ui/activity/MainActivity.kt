package com.withkwon.projecttemi.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.activity.viewModels
import androidx.navigation.findNavController
import com.robotemi.sdk.listeners.OnRobotReadyListener
import com.withkwon.projecttemi.R
import com.withkwon.projecttemi.databinding.ActivityMainBinding
import com.withkwon.projecttemi.ui.fragment.MainViewModel
import com.withkwon.projecttemi.util.Constants.TAG
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity(){
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val mainViewModel: MainViewModel by viewModels()
    private val navController by lazy { findNavController(R.id.nav_host_fragment) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.activity = this
        navController.navigateUp()

    }



}

