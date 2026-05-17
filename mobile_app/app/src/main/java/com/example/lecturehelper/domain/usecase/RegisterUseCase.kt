package com.example.lecturehelper.domain.usecase

import com.example.lecturehelper.data.repository.AuthRepository
import javax.inject.Inject

class RegisterUseCase @Inject constructor(

    private val repository: AuthRepository
) {

    suspend operator fun invoke(
        fio: String,
        email: String,
        password: String
    ): String {

        return repository.register(
            fio,
            email,
            password
        )
    }
}