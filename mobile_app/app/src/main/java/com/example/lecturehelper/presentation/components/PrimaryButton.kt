@Composable
fun PrimaryButton(

    text: String,

    onClick: () -> Unit
) {

    Button(
        onClick = onClick
    ) {

        Text(text)
    }
}