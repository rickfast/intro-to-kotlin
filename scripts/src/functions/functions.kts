package functions

// Functions
run {
    fun cube(x: Int): Int {
        return x * x * x
    }
}

run {
    fun cube(x: Int) = x * x * x
}

run {
    fun printCube(x: Int): Unit {
        println(x * x * x)
    }
}

run {
    fun printCube(x: Int) {
        println(x * x * x)
    }
}

// Default arguments
fun findEvens(numbers: List<Int>, maxResults: Int = 5): List<Int> {
    val result = mutableListOf<Int>()
    var count = 0
    for (num: Int in numbers) {
        if (num % 2 == 0) {
            result.add(num)
            count ++
        }
        if (count == maxResults) break
    }

    return result
}

println(findEvens(listOf(2, 4, 6, 8, 10), 3))

println(findEvens(listOf(2, 4, 6, 8, 10)))

// Named Parameters
fun doSomething(x: Int = 1, y: Boolean, z: String = "hello") {
    println("$x $y $z")
}

println(doSomething(y = true))
println(doSomething(z = "hi", y = false, x = 42))
println(doSomething(2, false, "goodbye"))
println(doSomething(2, false))