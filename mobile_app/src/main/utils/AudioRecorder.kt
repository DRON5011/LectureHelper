class AudioRecorder(private val context: Context) {

    private var recorder: MediaRecorder? = null
    private var filePath: String? = null

    fun start(): String {
        val file = File(context.filesDir, "record.mp4")
        filePath = file.absolutePath

        recorder = MediaRecorder().apply {
            setAudioSource(MediaRecorder.AudioSource.MIC)
            setOutputFormat(MediaRecorder.OutputFormat.MPEG_4)
            setOutputFile(filePath)
            setAudioEncoder(MediaRecorder.AudioEncoder.AAC)

            prepare()
            start()
        }

        return filePath!!
    }

    fun stop(): String? {
        recorder?.stop()
        recorder?.release()
        return filePath
    }
}