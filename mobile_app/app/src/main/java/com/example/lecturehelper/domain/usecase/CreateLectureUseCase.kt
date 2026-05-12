package com.example.lecturehelper.domain.usecase

import com.example.lecturehelper.data.repository.LectureRepository
import com.example.lecturehelper.domain.model.Lecture
import javax.inject.Inject

class CreateLectureUseCase @Inject constructor(

    private val repository: LectureRepository
) {

    suspend operator fun invoke(
        lection_name: String,
        course_name: String,
        lection_date: Date,
        start_time: Time,
        end_time: Time,
        status: String
    ): Lecture {

        return repository.createLecture(
            lection_name,
            course_name,
            lection_date,
            start_time,
            end_time,
            status
        )
    }
}