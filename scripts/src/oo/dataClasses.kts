package oo

run {
    data class Book(val title: String)

    println(Book("Lord of the Rings"))
}

enum class Genre { HISTORICAL_FICTION, SCIENCE_FICTION }

run {
    data class Book(val title: String, var genre: Genre)

    val book = Book("Cloud Atlas", Genre.SCIENCE_FICTION)
    val other = book.copy(genre = Genre.HISTORICAL_FICTION)

    println(other.title)
}