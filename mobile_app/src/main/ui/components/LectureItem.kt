@Composable
fun LectureItem(
    lecture: Lecture,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { onClick() }
    ) {
        Column(modifier = Modifier.padding(16.dp)) {

            Text(text = lecture.title)
            Text(text = lecture.subject)

            Text(text = "${lecture.date} ${lecture.start_time}")
        }
    }
}