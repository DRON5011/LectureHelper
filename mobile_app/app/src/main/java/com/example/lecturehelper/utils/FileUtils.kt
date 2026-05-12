package com.example.lectureai.utils

import android.content.Context
import java.io.File

object FileUtils {

    fun createAudioFile(
        context: Context
    ): File {

        val directory = File(
            context.filesDir,
            "lectures"
        )

        if (!directory.exists()) {
            directory.mkdirs()
        }

        return File(
            directory,
            "${System.currentTimeMillis()}.mp4"
        )
    }

    fun getFileSizeMb(
        file: File
    ): Double {

        return file.length() / 1024.0 / 1024.0
    }
}