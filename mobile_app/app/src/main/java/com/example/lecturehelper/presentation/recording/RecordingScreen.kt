@Composable
fun RecordingScreen(

    viewModel: RecordingViewModel
) {

    val isRecording by
        viewModel.isRecording.collectAsState()

    Button(

        onClick = {

            if (isRecording) {

                viewModel.stopRecording()

            } else {

                viewModel.startRecording()
            }
        }

    ) {

        Text(

            if (isRecording)
                "Остановить"
            else
                "Начать запись"
        )
    }
}