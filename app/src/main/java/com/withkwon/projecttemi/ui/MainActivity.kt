package com.withkwon.projecttemi.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.robotemi.sdk.Robot
import com.robotemi.sdk.TtsRequest
import com.robotemi.sdk.listeners.OnRobotReadyListener
import com.withkwon.projecttemi.R
import com.withkwon.projecttemi.databinding.ActivityMainBinding
import com.withkwon.projecttemi.util.Constants.TAG
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity(), OnRobotReadyListener {
    private val binding: ActivityMainBinding by lazy { DataBindingUtil.setContentView(this, R.layout.activity_main) }
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) = with(binding) {
        super.onCreate(savedInstanceState)
        lifecycleOwner = this@MainActivity

        mainViewModel.robot.addOnRobotReadyListener(this@MainActivity)
        buttonTest.setOnClickListener {
            editText.text.toString().let {
                if (it.isBlank()) {
                    Toast.makeText(this@MainActivity, "칸을 입력해주세요", Toast.LENGTH_SHORT).show()
                } else {
                    mainViewModel.speak(
                        speech = it,
                        isShowOnConversationLayer = false,
                        language = TtsRequest.Language.KO_KR
                    )
                }
            }
        }
        fab.setOnClickListener {
            mainViewModel.askQuestion("무엇을 도와드릴까요?")
        }
    }

    override fun onRobotReady(isReady: Boolean) {
        Log.d(TAG, "onRobotReady: $isReady")
        Log.d(TAG, "onCreate: ${mainViewModel.robot.batteryData}")
    }
}