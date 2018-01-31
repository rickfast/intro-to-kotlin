package io.rickfast.books

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BookStore

fun main(args: Array<String>) {
    runApplication<BookStore>(*args)
}
