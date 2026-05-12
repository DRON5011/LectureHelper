package com.example.lecturehelper.data.mapper

import com.example.lecturehelper.data.dto.LectureResponse
import com.example.lecturehelper.domain.model.Lecture

object LectureMapper {

    fun map(
        dto: LectureResponse
    ): Lecture {

        return Lecture(
            id = dto.id,
            lection_name = dto.lection_name,
            course_name = dto.course_name,
            lection_date = dto.lection_date,
            start_time = dto.start_time,
            end_time = dto.end_time,
            transcript = dto.transcript,
            summary = dto.summary,
            status = dto.status
        )
    }
}