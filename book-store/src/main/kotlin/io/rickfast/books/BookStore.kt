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
            GET("") { req ->
                json(bookService.findBooks(req.queryParam("genre").orElse(null)))
            }
            GET("/{id}") {
                json(bookService.findBookById(it.pathVariable("id").toInt()))
            }
            GET("/bad") { _ ->
                json(bookService.findAuthorsWithNoBooks())
            }
        }
        GET ("/authors/{id}") {
            json(bookService.findAuthorById(it.pathVariable("id").toInt()))
        }
        GET("/catalog") { _ ->
            json(bookService.getFullCatalog())
        }
        GET("/titles") { _ ->
            json(bookService.getAllTitles())
        }
    }
}

fun main(args: Array<String>) {
    runApplication<BookStore>(*args)
}
