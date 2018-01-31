package basics

// Simple strings
val greeting = "hi!"

println(greeting)
println(greeting[1])

// Escaping
val withEscaping = "Hello,\nKotlin"

println(withEscaping)

// Raw string, no escaping
val rawGreeting = """
    Hello,
    Kotlin
"""

println(rawGreeting)

// Raw string, trimmed
val withoutWhitespace = """
    |Hello,
    |Kotlin
""".trimMargin()

println(withoutWhitespace)

// String templates
val name = "Kotlin"

println("Hello, $name")
println("Hello, ${name.reversed()}")