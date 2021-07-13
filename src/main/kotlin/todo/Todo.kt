package todo

class Todo(
    val id: Int,
    val title: String,
) {
    fun getList(): List<Any> {
        return listOf(id, title)
    }
}