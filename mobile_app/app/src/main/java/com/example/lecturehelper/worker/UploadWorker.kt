package com.example.lecturehelper.worker

import android.content.Context
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.example.lecturehelper.data.repository.LectureRepository
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody.Companion.asRequestBody
import java.io.File

@HiltWorker
class UploadWorker @AssistedInject constructor(

    @Assisted appContext: Context,

    @Assisted params: WorkerParameters,

    private val repository: LectureRepository

) : CoroutineWorker(appContext, params) {

    override suspend fun doWork(): Result {

        return try {

            val filePath = inputData.getString("audio_path")
                ?: return Result.failure()

            val file = File(filePath)

            val requestBody = file.asRequestBody(
                "audio/mp4".toMediaTypeOrNull()
            )

            val multipart = MultipartBody.Part.createFormData(
                "file",
                file.name,
                requestBody
            )

            repository.uploadAudio(multipart)

            Result.success()

        } catch (e: Exception) {

            Result.retry()
        }
    }
}