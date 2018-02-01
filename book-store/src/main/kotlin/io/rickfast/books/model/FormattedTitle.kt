package io.rickfast.books.model

class FormattedTitle(book: Book, author: Author) {

    /**
     * Prints the title of the book in the form
     * {title} by {name}, where name is either the pen name
     * (if one exists) or the author's full name.
     */
    override fun toString(): String {
        throw RuntimeException("implement me")
    }
}