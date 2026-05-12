package com.example.lecturehelper.data.storage

import android.content.SharedPreferences

class PreferencesManager(
    private val prefs: SharedPreferences
) {

    fun saveTheme(theme: String) {

        prefs.edit()
            .putString("theme", theme)
            .apply()
    }

    fun getTheme(): String {

        return prefs.getString(
            "theme",
            "light"
        ) ?: "light"
    }
}