@Composable
fun AudioPlayerScreen(
    vm: AudioViewModel,
    audioUrl: String
) {

    Column(modifier = Modifier.padding(16.dp)) {

        Text("Audio Player")

        AudioControls(
            isPlaying = false,
            onPlay = { vm.playFromServer(audioUrl) },
            onStop = { vm.stop() }
        )
    }
}