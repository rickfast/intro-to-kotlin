package io.rickfast.books.repository

import io.rickfast.books.model.Author
import org.springframework.stereotype.Repository

@Repository
class AuthorRepository (private val bookData: BookData) {

    fun findAllAuthors(): List<Author> {
        throw RuntimeException("implement me")
    }

    fun findAuthorById(id: Int): Author? {
        throw RuntimeException("implement me")
    }

    fun findAuthorsByPenLike(search: String): List<Author> {
        throw RuntimeException("implement me")
    }
}