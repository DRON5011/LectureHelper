@Composable
fun LectureListScreen(vm: LectureViewModel) {

    LaunchedEffect(Unit) {
        vm.loadLectures()
    }

    LazyColumn {
        items(vm.lectures) {
            Text(it.title)
        }
    }
}