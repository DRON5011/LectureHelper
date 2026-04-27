@Composable
fun LoginScreen(vm: AuthViewModel) {

    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column {
        TextField(value = username, onValueChange = { username = it })
        TextField(value = password, onValueChange = { password = it })

        Button(onClick = {
            vm.login(username, password)
        }) {
            Text("Login")
        }
    }
}