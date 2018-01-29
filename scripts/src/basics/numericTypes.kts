package basics

// Numeric Literals
val int = 123
val long = 123L
val hex = 0x0A
val binary = 0b01001100
val double = 0.123
val float = 0.123f

// Internal Representation
val age: Int = 38 // primitive int
val years: Int? = age // auto-boxed

println(age == years)

println(age === years)