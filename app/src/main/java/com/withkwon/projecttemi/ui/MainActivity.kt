package com.withkwon.projecttemi.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.robotemi.sdk.Robot
import com.robotemi.sdk.listeners.OnRobotReadyListener
import com.withkwon.projecttemi.R
import com.withkwon.projecttemi.util.Constants.TAG
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity(), OnRobotReadyListener {
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel.robot.addOnRobotReadyListener(this)
    }

    override fun onRobotReady(isReady: Boolean) {
        Log.d(TAG, "onRobotReady: $isReady")
        Log.d(TAG, "onCreate: ${mainViewModel.robot.batteryData}")
    }
}