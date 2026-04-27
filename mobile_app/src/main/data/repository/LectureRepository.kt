class LectureRepository(private val api: ApiService) {

    suspend fun getLectures(): List<Lecture> {
        return api.getLectures()
    }
}