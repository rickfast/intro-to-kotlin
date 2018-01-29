data class Student(val name: String, val age: Int)

fun getStudentByName(name: String): Student {
    return Student(name, 20)
}

val (name, age) = getStudentByName("Bob Smith")

val student = Student("Bob Smith", 20)

println(student.component1())
println(student.component2())

val map = mapOf("a" to 10, "b" to 20)

map.mapValues { entry -> "${entry.value}!" }
map.mapValues { (key, value) -> "$value!" }
map.mapValues { (_, value) -> "$value!" }

