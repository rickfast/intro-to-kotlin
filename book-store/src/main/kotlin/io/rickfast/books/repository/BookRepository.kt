package io.rickfast.books.repository

import io.rickfast.books.model.Book
import org.springframework.stereotype.Repository

@Repository
class BookRepository(private val bookData: BookData) {

    fun findAllBooks(): List<Book> {
        throw RuntimeException("implement me")
    }

    fun findBooksByAuthorId(authorId: Int): List<Book> {
        throw RuntimeException("implement me")
    }

    fun findBookById(id: Int): List<Book> {
        throw RuntimeException("implement me")
    }
}