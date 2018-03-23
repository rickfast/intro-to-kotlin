fun notInlined(getString: () -> String?) = println(getString())

inline fun inlined(getString: () -> String?) = println(getString())

fun greet() {
    var x = "hello!"

    notInlined { x }

    inlined { x }
}

greet()