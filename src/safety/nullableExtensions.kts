fun Int?.toString() = this?.toString() ?: "-1"

val x: Int? = null
println(x.toString())