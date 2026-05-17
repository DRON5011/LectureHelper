package com.example.lecturehelper.presentation.recording

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.*

class RecordingViewModel : ViewModel() {

    private val _isRecording =
        MutableStateFlow(false)

    val isRecording: StateFlow<Boolean> =
        _isRecording

    fun startRecording() {

        _isRecording.value = true
    }

    fun stopRecording() {

        _isRecording.value = false
    }
}