package basics

interface Animal {
    fun say(): String
}

class Cat : Animal {
    override fun say() = "meow"
}

class Dog : Animal {
    override fun say() = "woof"
}

val animals: Array<Animal> = arrayOf(Cat(), Dog())

run {
    for (animal: Animal in animals) {
        println(animal.say())
    }
}

run {
    for ((index: Int, animal: Animal) in animals.withIndex()) {
        println(index)
        println(animal.say())
    }
}

run {
    var i = 0

    while (i < animals.size) {
        println(i)
        println(animals[i].say())
        i++
    }
}