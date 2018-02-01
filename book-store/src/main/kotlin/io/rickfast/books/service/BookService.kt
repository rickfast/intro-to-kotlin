package io.rickfast.books.service

import io.rickfast.books.model.Author
import io.rickfast.books.model.Book
import io.rickfast.books.model.CatalogItem
import io.rickfast.books.model.FormattedTitle
import io.rickfast.books.repository.AuthorRepository
import io.rickfast.books.repository.BookRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BookService @Autowired constructor(private val bookRepository: BookRepository,
                                         private val authorRepository: AuthorRepository) {

    fun getFullCatalog(): List<CatalogItem> {
        throw RuntimeException("implement me")
    }

    fun findBooks(genre: String?): List<Book> {
        throw RuntimeException("implement me")
    }

    fun findAuthorsWithNoBooks(): List<Author> {
        throw RuntimeException("implement me")
    }

    fun findBookById(id: Int): Book {
        throw RuntimeException("implement me")
    }

    fun findAuthorById(id: Int): Book {
        throw RuntimeException("implement me")
    }

    fun getAllTitles(): List<FormattedTitle> {
        throw RuntimeException("implement me")
    }
}