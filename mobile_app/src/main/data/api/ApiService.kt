interface ApiService {

    @POST("users/register/")
    suspend fun register(@Body body: RegisterRequest): Response<Unit>

    @POST("token/")
    suspend fun login(@Body body: LoginRequest): Response<TokenResponse>

    @GET("lectures/")
    suspend fun getLectures(): List<Lecture>

    @Multipart
    @POST("audio/upload/")
    suspend fun uploadAudio(
        @Part file: MultipartBody.Part,
        @Part("lecture_id") lectureId: RequestBody
    ): Response<Unit>
}