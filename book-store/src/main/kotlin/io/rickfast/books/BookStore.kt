package io.rickfast.books

import io.rickfast.books.service.BookService
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.BodyInserters.fromObject
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.router

fun <T> json(obj: T) = ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(fromObject(obj))

@SpringBootApplication
class BookStore {

    @Bean
    fun routerFunction(bookService: BookService): RouterFunction<ServerResponse> = router {
        ("/books").nest {
            GET("") {
                json(bookService.findBooks(it.queryParam("genre").orElse(null)))
            }
            GET("/{id}") {
                json(bookService.findBookById(it.pathVariable("id").toInt()))
            }
            GET("/bad") {
                json(bookService.findAuthorsWithNoBooks())
            }
        }
        ("/authors").nest {
            GET("/{id}") {
                json(bookService.findAuthorById(it.pathVariable("id").toInt()))
            }
        }
        GET("/catalog") {
            json(bookService.getFullCatalog())
        }
    }
}

fun main(args: Array<String>) {
    runApplication<BookStore>(*args)
}
