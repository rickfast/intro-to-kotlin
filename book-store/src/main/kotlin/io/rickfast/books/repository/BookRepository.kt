package io.rickfast.books.repository

import io.rickfast.books.model.Book
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository

@Repository
class BookRepository @Autowired constructor(private val bookData: BookData) {

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