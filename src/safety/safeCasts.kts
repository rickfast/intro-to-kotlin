open class Animal
class Dog : Animal()
class Cat : Animal() {
    fun meow() = "meow"
}

fun meowIfPossible(animal: Animal) {
    if (animal is Cat) {
        println(animal.meow())
    }
}

val animal = Animal()

println(animal as? Cat)

