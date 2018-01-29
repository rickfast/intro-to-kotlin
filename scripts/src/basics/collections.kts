package basics

val numbers = listOf(1, 2, 3)
val letters = setOf("a", "b", "c")
val both = mapOf("a" to 1, "b" to 2, "c" to 3)

val numbersList = mutableListOf(1, 2, 3)
val numbersArrayList = arrayListOf(1, 2, 3)
val lettersSet = mutableSetOf("a", "b", "c")
val lettersHashSet = hashSetOf("a", "b", "c")
val lettersLinkedSet = linkedSetOf("a", "b", "c")
val bothMap = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
val bothHashMap = hashMapOf("a" to 1, "b" to 2, "c" to 3)
val bothLinkedMap = linkedMapOf("a" to 1, "b" to 2, "c" to 3)

numbersList.add(4)
bothMap["d"] = 4

run {
    val numbers = mutableListOf(1, 2, 3, null)

    numbers.add(4)
    println(numbers)

    println(numbers.filterNotNull())

    println(numbers.first())

    println(numbers.last())
}

run {
    val numbers = mutableListOf(1, 2, 3, 4, 5)

    println(numbers.filter { it % 2 == 0 })

    println(numbers.asReversed())

    println(numbers.map { it * 2 })

    println(numbers.associate { it to Math.sqrt(it.toDouble()) })
}

run {
    val ages = mapOf("bob" to 20, "bill" to 31, "sally" to 32)
    val overThirty = ages.filterValues { it > 30 }

    println(overThirty)
}