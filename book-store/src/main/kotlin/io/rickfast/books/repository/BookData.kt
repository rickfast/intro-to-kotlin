package io.rickfast.books.repository

import io.rickfast.books.model.Author
import io.rickfast.books.model.Book
import io.rickfast.books.model.Genre
import org.springframework.stereotype.Component

@Component
class BookData {

    val books = listOf<Book>()
    val authors = listOf<Author>()

    fun initialize() {
        books + listOf(
                Book(1, "A Game of Thrones", 1, Genre.FANTASY),
                Book(2, "A Feast for Crows", 1, Genre.FANTASY),
                Book(3, "A Storm of Swords", 1, Genre.FANTASY),
                Book(4, "Fifty Shades of Gray", 2, Genre.ROMANCE)
        )

        authors + listOf(
                Author(1, "George", "Martin", "George R. R. Martin"),
                Author(2, "Erika", "Mitchell", "E. L. James")
        )
    }
}