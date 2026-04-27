class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val api = ApiClient.create(this)
        val tokenManager = TokenManager(this)

        val authRepo = AuthRepository(api, tokenManager)
        val lectureRepo = LectureRepository(api)

        val authVM = AuthViewModel(authRepo)
        val lectureVM = LectureViewModel(lectureRepo)
        
        val audioVM = AudioViewModel(api, this)
        AudioScreen(audioVM, lectureId = 1)

        val roleManager = RoleManager(this)
        
        setContent {
            if (!authVM.loginState) {
                LoginScreen(authVM)
            } else {
                LectureListScreen(lectureVM)
            }
        }
    }
}