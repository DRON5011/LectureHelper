package com.example.lecturehelper.presentation.lecture

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lecturehelper.domain.usecase.GetLecturesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LectureViewModel @Inject constructor(

    private val getLecturesUseCase:
        GetLecturesUseCase

) : ViewModel() {

    private val _state =
        MutableStateFlow(
            LectureUiState()
        )

    val state: StateFlow<LectureUiState> =
        _state

    init {

        loadLectures()
    }

    private fun loadLectures() {

        viewModelScope.launch {

            try {

                _state.value =
                    state.value.copy(
                        isLoading = true
                    )

                val lectures =
                    getLecturesUseCase()

                _state.value =
                    state.value.copy(
                        lectures = lectures,
                        isLoading = false
                    )

            } catch (e: Exception) {

                _state.value =
                    state.value.copy(
                        error = e.message
                    )
            }
        }
    }
}