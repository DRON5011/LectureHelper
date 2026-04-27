class AudioViewModel(
    private val api: ApiService,
    private val context: Context
) : ViewModel() {

    private val recorder = AudioRecorder(context)
    private val player = AudioPlayer()

    var isRecording by mutableStateOf(false)
    var filePath: String? = null

    fun startRecording() {
        filePath = recorder.start()
        isRecording = true
    }

    fun stopRecording() {
        filePath = recorder.stop()
        isRecording = false
    }

    fun playLocal() {
        filePath?.let {
            player.play(it)
        }
    }

    fun playFromServer(url: String) {
        player.play(url)
    }

    fun stop() {
        player.stop()
    }

    fun upload(lectureId: Int) {
        val file = File(filePath ?: return)

        val requestFile = file
            .asRequestBody("audio/mp4".toMediaType())

        val body = MultipartBody.Part.createFormData(
            "file",
            file.name,
            requestFile
        )

        val lecturePart = lectureId
            .toString()
            .toRequestBody("text/plain".toMediaType())

        viewModelScope.launch(Dispatchers.IO) {
            api.uploadAudio(body, lecturePart)
        }
    }
}