package com.example.lecturehelper.domain.usecase

import com.example.lecturehelper.data.repository.AuthRepository
import javax.inject.Inject

class LoginUseCase @Inject constructor(

    private val repository: AuthRepository
) {

    suspend operator fun invoke(
        email: String,
        password: String
    ): String {

        return repository.login(
            email,
            password
        )
    }
}