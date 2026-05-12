package com.example.lecturehelper.services

import android.app.NotificationManager
import android.content.Context
import androidx.core.app.NotificationCompat
import com.example.lecturehelper.R

class NotificationService(

    private val context: Context
) {

    fun showUploadComplete() {

        val notification = NotificationCompat.Builder(
            context,
            AudioRecordingService.CHANNEL_ID
        )
            .setContentTitle("lecturehelper")
            .setContentText("Лекция успешно обработана")
            .setSmallIcon(R.drawable.ic_launcher_foreground)
            .build()

        val manager =
            context.getSystemService(
                Context.NOTIFICATION_SERVICE
            ) as NotificationManager

        manager.notify(
            100,
            notification
        )
    }

    fun showAiProcessing() {

        val notification = NotificationCompat.Builder(
            context,
            AudioRecordingService.CHANNEL_ID
        )
            .setContentTitle("lecturehelper")
            .setContentText("AI обрабатывает лекцию")
            .setSmallIcon(R.drawable.ic_launcher_foreground)
            .build()

        val manager =
            context.getSystemService(
                Context.NOTIFICATION_SERVICE
            ) as NotificationManager

        manager.notify(
            101,
            notification
        )
    }
}