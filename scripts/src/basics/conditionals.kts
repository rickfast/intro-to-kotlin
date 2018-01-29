package basics

run {
    fun compare(x: Int, y: Int): Int {
        if (x < y) {
            return -1
        } else {
            return 1
        }
    }
}

run {
    fun compare(x: Int, y: Int): Int {
        val result = if (x < y) {
            -1
        } else {
            1
        }

        return result
    }
}

run {
    fun compare(x: Int, y: Int) = if (x < y) -1 else 1
}

run {
    fun compare(x: Int, y: Int) = if (x < y) {
        println("x is smaller")
        -1
    } else {
        println("x is bigger")
        1
    }
}

val animals = mutableListOf("cat", "dog", "wolf")
fun getAnimal() = animals.removeAt(0)

// when
run {
    val animal = getAnimal()

    when (animal) {
        "cat" -> println("meow")
        "dog" -> println("woof")
        else -> println("n/a")
    }
}

run {
    val animal = getAnimal()

    val sound = when (animal) {
        "cat" -> "meow"
        "dog" -> "woof"
        else -> "n/a"
    }

    println(sound)
}

run {
    val animal = getAnimal()

    val sound = when (animal) {
        "cat" -> "meow"
        "dog", "wolf" -> "woof"
        else -> "n/a"
    }

    println(sound)
}

interface Animal {
    fun isCanine(): Boolean
}

class Cat : Animal {
    override fun isCanine() = false
}

class Dog : Animal {
    override fun isCanine() = true
}

run {
    val animal: Animal = Cat()

    val sound = when {
        animal.isCanine() -> "woof"
        else -> "meow"
    }

    println(sound)
}