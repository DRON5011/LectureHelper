package com.example.lecturehelper.services

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.Service
import android.content.Intent
import android.media.MediaRecorder
import android.os.Build
import android.os.IBinder
import androidx.core.app.NotificationCompat
import com.example.lecturehelper.R
import java.io.File

class AudioRecordingService : Service() {

    private var recorder: MediaRecorder? = null

    private lateinit var outputFile: File

    companion object {

        const val CHANNEL_ID = "lecture_recording"

        const val ACTION_START = "ACTION_START"

        const val ACTION_STOP = "ACTION_STOP"
    }

    override fun onCreate() {

        super.onCreate()

        createNotificationChannel()
    }

    override fun onStartCommand(
        intent: Intent?,
        flags: Int,
        startId: Int
    ): Int {

        when (intent?.action) {

            ACTION_START -> {

                startForeground(
                    1,
                    createNotification()
                )

                startRecording()
            }

            ACTION_STOP -> {

                stopRecording()

                stopSelf()
            }
        }

        return START_STICKY
    }

    private fun startRecording() {

        outputFile = File(
            filesDir,
            "lecture_${System.currentTimeMillis()}.mp4"
        )

        recorder = MediaRecorder().apply {

            setAudioSource(
                MediaRecorder.AudioSource.MIC
            )

            setOutputFormat(
                MediaRecorder.OutputFormat.MPEG_4
            )

            setAudioEncoder(
                MediaRecorder.AudioEncoder.AAC
            )

            setOutputFile(
                outputFile.absolutePath
            )

            prepare()

            start()
        }
    }

    private fun stopRecording() {

        recorder?.apply {

            stop()

            release()
        }

        recorder = null
    }

    private fun createNotification(): Notification {

        return NotificationCompat.Builder(
            this,
            CHANNEL_ID
        )
            .setContentTitle("lecturehelper")
            .setContentText("Идёт запись лекции")
            .setSmallIcon(R.drawable.ic_launcher_foreground)
            .build()
    }

    private fun createNotificationChannel() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

            val channel = NotificationChannel(

                CHANNEL_ID,

                "Lecture Recording",

                NotificationManager.IMPORTANCE_LOW
            )

            val manager =
                getSystemService(
                    NotificationManager::class.java
                )

            manager.createNotificationChannel(channel)
        }
    }

    override fun onBind(intent: Intent?): IBinder? = null
}