// reified
class Thing
inline fun <reified T> instantiate(): T = T::class.java.newInstance()

val thing = instantiate<Thing>()
println(thing.javaClass)