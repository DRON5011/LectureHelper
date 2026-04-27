class LectureViewModel(private val repo: LectureRepository) : ViewModel() {

    var lectures by mutableStateOf<List<Lecture>>(emptyList())

    fun loadLectures() {
        viewModelScope.launch {
            lectures = repo.getLectures()
        }
    }
}