@Composable
fun AudioRecordScreen(
    vm: AudioViewModel,
    roleManager: RoleManager,
    lectureId: Int
) {

    if (!roleManager.isTeacher()) {
        Text("Доступ запрещён")
        return
    }

    Column {

        Button(onClick = {
            if (!vm.isRecording) vm.startRecording()
            else vm.stopRecording()
        }) {
            Text(if (vm.isRecording) "Stop" else "Record")
        }

        Button(onClick = { vm.upload(lectureId) }) {
            Text("Upload")
        }
    }
}