// Generics and Functions
class Thing
fun <T> instantiate(klazz: Class<T>): T = klazz.newInstance()

val thing = instantiate(Thing::class.java)
println(thing.javaClass)

