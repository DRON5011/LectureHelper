package com.example.lecturehelper.presentation.auth

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lecturehelper.domain.usecase.LoginUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(

    private val loginUseCase: LoginUseCase

) : ViewModel() {

    private val _state =
        MutableStateFlow(AuthUiState())

    val state: StateFlow<AuthUiState> =
        _state

    fun login(
        email: String,
        password: String
    ) {

        viewModelScope.launch {

            try {

                _state.value =
                    state.value.copy(
                        isLoading = true
                    )

                val token =
                    loginUseCase(
                        email,
                        password
                    )

                _state.value =
                    state.value.copy(
                        token = token,
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