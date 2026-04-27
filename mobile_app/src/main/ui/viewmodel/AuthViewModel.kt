class AuthViewModel(private val repo: AuthRepository) : ViewModel() {

    var loginState by mutableStateOf(false)

    fun login(username: String, password: String) {
        viewModelScope.launch {
            loginState = repo.login(username, password)
        }
    }
}