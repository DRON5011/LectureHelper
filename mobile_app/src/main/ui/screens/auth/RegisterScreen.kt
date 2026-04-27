@Composable
fun RegisterScreen(onRegister: (RegisterRequest) -> Unit) {

    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var fullName by remember { mutableStateOf("") }
    var role by remember { mutableStateOf("student") }

    Column {

        TextField(username, { username = it }, label = { Text("Username") })
        TextField(password, { password = it }, label = { Text("Password") })
        TextField(email, { email = it }, label = { Text("Email") })
        TextField(fullName, { fullName = it }, label = { Text("Full name") })

        Row {
            Button(onClick = { role = "student" }) {
                Text("Student")
            }
            Button(onClick = { role = "teacher" }) {
                Text("Teacher")
            }
        }

        Button(onClick = {
            onRegister(
                RegisterRequest(
                    username = username,
                    password = password,
                    email = email,
                    full_name = fullName,
                    role = role
                )
            )
        }) {
            Text("Register")
        }
    }
}