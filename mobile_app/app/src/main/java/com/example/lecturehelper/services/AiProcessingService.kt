package com.example.lecturehelper.services

import android.app.Service
import android.content.Intent
import android.os.IBinder
import kotlinx.coroutines.*

class AiProcessingService : Service() {

    private val scope = CoroutineScope(
        Dispatchers.IO
    )

    override fun onStartCommand(
        intent: Intent?,
        flags: Int,
        startId: Int
    ): Int {

        scope.launch {

            monitorProcessing()
        }

        return START_STICKY
    }

    private suspend fun monitorProcessing() {

        while (true) {

            delay(10000)

            // Проверка статуса AI обработки
        }
    }

    override fun onDestroy() {

        super.onDestroy()

        scope.cancel()
    }

    override fun onBind(intent: Intent?): IBinder? = null
}