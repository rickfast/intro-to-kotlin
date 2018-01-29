package basics

interface Animal {
    fun isCanine(): Boolean
    fun say(): String
}

class Cat : Animal {
    override fun isCanine() = false
    override fun say() = "meow"
}

class Dog : Animal {
    override fun isCanine() = true
    override fun say() = "woof"
}

val animal = Cat()

val sound = when {
    animal.isCanine() -> "woof"
    else -> "meow"
}

println(sound)

val animals = arrayOf(Cat(), Dog())

for (animal: Animal in animals) {
    println(animal.say())
}

for ((index: Int, animal: Animal) in animals.withIndex()) {
    println(index)
    println(animal.say())
}

val i = 0

while (i < animals.size) {
    println(i)
    println(animals[i].say())
}