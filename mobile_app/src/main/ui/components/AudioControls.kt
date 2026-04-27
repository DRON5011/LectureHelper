@Composable
fun AudioControls(
    isPlaying: Boolean,
    onPlay: () -> Unit,
    onStop: () -> Unit
) {
    Row {
        Button(onClick = onPlay) {
            Text("Play")
        }

        Spacer(modifier = Modifier.width(8.dp))

        Button(onClick = onStop) {
            Text("Stop")
        }
    }
}