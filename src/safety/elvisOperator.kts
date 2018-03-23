data class Book(val title: String)

fun getTitle(book: Book?) = book?.title ?: "N/A"

println(getTitle(null))