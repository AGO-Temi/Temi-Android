package com.withkwon.projecttemi.ui.fragment

import androidx.lifecycle.ViewModel
import com.robotemi.sdk.Robot
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    val robot: Robot
) : ViewModel() {

}