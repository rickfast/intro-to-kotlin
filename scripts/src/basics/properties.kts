package basics

run {
    class Author(val first: String, val last: String) {
        var pen: String? = null
    }

    val author = Author("Samuel", "Clemens")

    author.pen = "Mark Twain"

    println(author.first)
}

run {
    class Author(val first: String, val last: String) {
        var pen: String? = null
        val hasPenName: Boolean
            get() = this.pen != null
    }

    val author = Author("Samuel", "Clemens")

    author.pen = "Mark Twain"

    println(author.hasPenName)
}