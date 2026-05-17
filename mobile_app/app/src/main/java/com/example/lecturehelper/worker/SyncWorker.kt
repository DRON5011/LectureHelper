package com.example.lecturehelper.worker

import android.content.Context
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.example.lecturehelper.data.repository.LectureRepository
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject

@HiltWorker
class SyncWorker @AssistedInject constructor(

    @Assisted appContext: Context,

    @Assisted params: WorkerParameters,

    private val repository: LectureRepository

) : CoroutineWorker(appContext, params) {

    override suspend fun doWork(): Result {

        return try {

            repository.getLectures()

            Result.success()

        } catch (e: Exception) {

            Result.retry()
        }
    }
}