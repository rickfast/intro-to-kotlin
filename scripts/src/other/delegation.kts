interface Animal {
    fun say(): String
    fun hasTail(): Boolean
}

class Cat : Animal {
    override fun say() = "meow"
    override fun hasTail() = true
}

class Manx(cat: Cat) : Animal by cat {
    override fun hasTail() = false
}

println(Manx(Cat()).hasTail())