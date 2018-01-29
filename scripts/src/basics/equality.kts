package basics

// referential
run {
    val x = "hello"
    val y = x
    val z = "hello"

    println(x === y)

    println(x === z)
}

// structural
run {
    val x = "hello"
    val y = x
    val z = "hello"
    val q = "bye"

    println(x === y)

    println(x == z)

    println(x == q)

    println(null === y)
}