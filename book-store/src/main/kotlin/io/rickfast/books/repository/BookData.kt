package io.rickfast.books.repository

import io.rickfast.books.model.Author
import io.rickfast.books.model.Book
import io.rickfast.books.model.Genre
import org.springframework.stereotype.Component

@Component
class BookData {

    val books = listOf(
            Book(1, "A Game of Thrones", 1, Genre.FANTASY),
            Book(2, "A Feast for Crows", 1, Genre.FANTASY),
            Book(3, "A Storm of Swords", 1, Genre.FANTASY),
            Book(4, "Fifty Shades of Gray", 2, Genre.ROMANCE),
            Book(5, "Cat's Cradle", 3, Genre.SCI_FI),
            Book(6, "The Adventures of Huck Finn", 4, Genre.FICTION)
    )

    val authors = listOf(
            Author(1, "George", "Martin", "George R. R. Martin"),
            Author(2, "Erika", "Mitchell", "E. L. James"),
            Author(3, "Kurt", "Vonegut"),
            Author(4, "Samuel", "Clemens", "Mark Twain")
    )
}