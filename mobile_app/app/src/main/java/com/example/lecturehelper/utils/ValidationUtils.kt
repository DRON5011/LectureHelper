package com.example.lecturehelper.utils

import android.util.Patterns

object ValidationUtils {

    fun isValidEmail(
        email: String
    ): Boolean {

        return Patterns.EMAIL_ADDRESS
            .matcher(email)
            .matches()
    }

    fun isValidPassword(
        password: String
    ): Boolean {

        return password.length >= 6
    }

    fun isLectureTitleValid(
        title: String
    ): Boolean {

        return title.length >= 3
    }
}