class AudioPlayer {

    private var player: MediaPlayer? = null

    fun play(path: String) {
        player = MediaPlayer().apply {
            setDataSource(path)
            prepare()
            start()
        }
    }

    fun stop() {
        player?.release()
        player = null
    }
}