package com.example.lecturehelper.data.repository

import com.example.lecturehelper.data.api.LectureApi
import com.example.lecturehelper.domain.model.Lecture
import okhttp3.MultipartBody
import javax.inject.Inject

class LectureRepository @Inject constructor(
    private val lectureApi: LectureApi
) {

    suspend fun getLectures(): List<Lecture> {
        return lectureApi.getLectures()
    }

    suspend fun getLecture(
        id: String
    ): Lecture {
        return lectureApi.getLecture(id)
    }

    suspend fun createLecture(
        lection_name: String,
        course_name: String,
        lection_date: Date,
        start_time: Time,
        end_time: Time,
        status: String
    ): Lecture {

        return lectureApi.createLecture(
            CreateLectureRequest(
                lection_name,
                course_name,
                lection_date,
                start_time,
                end_time,
                status
            )
        )
    }

    suspend fun uploadAudio(
        file: MultipartBody.Part
    ) {
        lectureApi.uploadLectureAudio(file)
    }
}