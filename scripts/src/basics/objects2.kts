package basics

object Bob {
    val firstName = "Robert"
    fun introduce() {
        println("hi, I’m $firstName")
    }
}

Bob.introduce()

interface Handler {
    fun onResult(result: Boolean)
    fun onError(error: Throwable)
}

fun attachHandler(handler: Handler) {
    // something
}

attachHandler(object : Handler {
    override fun onResult(result: Boolean) = println(result)
    override fun onError(error: Throwable) = error.printStackTrace()
})

run {
    class Widget {
        companion object Factory {
            fun create(): Widget = Widget()
        }
    }

    val myWidget = Widget.create()
}

run {
    class Widget {
        companion object {
            fun create(): Widget = Widget()
        }
    }

    val myWidget = Widget.create()
}