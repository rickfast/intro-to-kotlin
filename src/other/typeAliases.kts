interface Bird
class Seagull : Bird
class Crow : Bird

data class Birdseed(val grams: Int)

typealias Flock = List<Seagull>
typealias Murder = List<Crow>

typealias Feeder = (Bird, Birdseed) -> Unit

val murderOfCrows: Murder = listOf(Crow(), Crow())

println(murderOfCrows)