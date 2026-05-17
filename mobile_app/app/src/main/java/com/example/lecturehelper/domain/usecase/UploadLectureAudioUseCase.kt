package com.example.lecturehelper.domain.usecase

import com.example.lecturehelper.data.repository.LectureRepository
import okhttp3.MultipartBody
import javax.inject.Inject

class UploadLectureAudioUseCase @Inject constructor(

    private val repository: LectureRepository
) {

    suspend operator fun invoke(
        file: MultipartBody.Part
    ) {

        repository.uploadAudio(file)
    }
}