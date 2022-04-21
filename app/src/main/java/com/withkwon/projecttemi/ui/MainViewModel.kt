package com.withkwon.projecttemi.ui

import androidx.lifecycle.ViewModel
import com.robotemi.sdk.Robot
import com.robotemi.sdk.TtsRequest
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    val robot: Robot
) : ViewModel() {
    fun speak(speech: String, isShowOnConversationLayer: Boolean, language: TtsRequest.Language) {
        val ttsRequest = TtsRequest.create(
            speech = speech,
            isShowOnConversationLayer = isShowOnConversationLayer,
            language = language
        )
        robot.speak(ttsRequest)
    }
    fun askQuestion(question: String) {
        robot.askQuestion(question)
        robot.addAsrListener(object : Robot.AsrListener {
            override fun onAsrResult(asrResult: String) {

            }
        })
    }
}