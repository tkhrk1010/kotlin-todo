package todo

class Todo(
    val id: Int,
    val title: String,
//    val list: List<String> = listOf("a", "b", "c")
//    val list: String = "a"
) {
    fun getList(): List<Any> {
        return listOf(id, title)
    }
}