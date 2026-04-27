@Composable
fun LectureDetailScreen(
    lecture: Lecture,
    roleManager: RoleManager,
    vm: AudioViewModel,
    onPlay: (String) -> Unit
) {

    val isTeacher = roleManager.isTeacher()

    Column(modifier = Modifier.padding(16.dp)) {

        Text(lecture.title)
        Text(lecture.subject)

        Spacer(modifier = Modifier.height(16.dp))

        // 👉 ТОЛЬКО ПРЕПОДАВАТЕЛЬ
        if (isTeacher) {

            Button(onClick = { vm.startRecording() }) {
                Text("Start recording")
            }

            Button(onClick = { vm.stopRecording() }) {
                Text("Stop recording")
            }

            Button(onClick = { vm.upload(lecture.id) }) {
                Text("Upload audio")
            }

        } else {

            Text("Вы можете только слушать лекции")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            onPlay("http://10.0.2.2:8000/media/audio/file.mp4")
        }) {
            Text("Play audio")
        }
    }
}