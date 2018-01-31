package functions

run {
    fun safelyDo(func: () -> Unit) {
        try {
            func()
        } catch (e: Exception) {
            println("Ignoring error")
        }
    }

    safelyDo({ throw Exception() })
}

run {
    fun safelyDo(func: () -> Unit) {
        try {
            func()
        } catch (e: Exception) {
            println("Ignoring error")
        }
    }

    safelyDo { throw Exception() }
}

run {
    val numbers = listOf(1, 2, 3)

    val tripled = numbers.map { num -> num * 3 }

    println(tripled)
}

run {
    val numbers = listOf(1, 2, 3)

    val tripled = numbers.map { it * 3 }

    println(tripled)
}

run {
    fun printValues(data: Map<String, String>) {
        data.forEach { _, v ->
            println(v)
        }
    }
}

run {
    val list = listOf(2, 1)
    java.util.Collections.sort(list, { o1, o2 -> o1.compareTo(o2) })
}

run {
    listOf(1, 2, 3).filter {
        val shouldFilter = it > 0
        shouldFilter
    }
}

// closure
run {
    var x = 0

    listOf(1, 2, 3).forEach {
        x += it
    }

    println(x)
}