package basics

// Simple strings
val greeting = "hi!"

println(greeting)
println(greeting[1])

// Escaping
val withEscaping = "Hello,\nKotlin"

println(withEscaping)

// Raw string, no escaping
val rawGreeting = """
    Hello,
    Kotlin
"""

println(rawGreeting)

// Raw string, trimmed
val withoutWhitespace = """
    |Hello,
    |Kotlin
""".trimMargin()

println(withoutWhitespace)

// String templates
val name = "Kotlin"

println("Hello, $name")
println("Hello, ${name.reversed()}")


open class Animal
class Dog : Animal()
class Cat : Animal() {
    fun meow() = "meow"
}

val dog = Animal()

println(dog as? Cat)

val x = "hello"
val y = x
val z = "hello"
val q = "bye"

println(x === y)
// true

println(x == z)
// true

println(x == q)
// false

println(null === y)
// false


object Bob

println(Bob.hashCode())

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

fun doSomething(x: Int = 1, y: Boolean, z: String = "hello") {
    println("$x $y $z")
}
doSomething(2, false, "gb")
doSomething(z = "farts", y = true, x = 10)

val numbers = mutableListOf(1, 2, 3, 4, 5)

println(numbers.filter { it % 2 == 0 })

println(numbers.asReversed())

println(numbers.map { it * 2 })

println(numbers.associate { it to Math.sqrt(it.toDouble()) })

val ages = mapOf("rick" to 31)

println(ages.filterValues { it > 30 })

println(listOf(1) + 1)

fun safelyDo(func: () -> Unit) {
    try {
        func()
    } catch (e: Exception) {
        println("Ignoring error")
    }
}

safelyDo { throw Exception() }


interface Bird
class Seagull : Bird
class Crow : Bird

data class Birdseed(val grams: Int)

typealias Flock = List<Seagull>
typealias Murder = List<Crow>

typealias Feeder = (Bird) -> Unit

val murderOfCrows: Murder = listOf(Crow(), Crow())
