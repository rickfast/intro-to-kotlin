package functions

fun Int.squared() = this * this

println(10.squared())

open class Person

class Dude: Person()

fun Person.sup() = "hello"

fun Dude.sup() = "sup bro"

fun printSup(person: Person) {
    println(person.sup())
}

printSup(Dude())

fun String?.isBlank() = this == null || this.isEmpty()

val text = "hello"
println(text.isBlank())
