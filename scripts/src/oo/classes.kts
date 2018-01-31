package oo

class Pointless

// Constructors
run {
    class Point constructor(x: Int, y: Int) {
    }
}

run {
    class Point(x: Int, y: Int) {
        init {
            println("initializing x: $x y: $y")
        }
    }
}

run {
    class Point(x: Int, y: Int) {
        private val point = Pair(x, y)
        init {
            println("initializing x: $x y: $y")
        }
    }
}

run {
    class Point(var x: Int, var y: Int) {
        fun display() {
            println("initializing x: $x y: $y")
        }
    }
}

run {
    class Point(var x: Int, var y: Int) {
        constructor(point: Point): this(point.x, point.y) {
            println("copying point")
        }
    }
}

run {
    class Point(var x: Int, var y: Int) {
    }

    val point = Point(20, 30)
}

run {
    open class Point(var x: Int, var y: Int) {}

    class Point3d(x: Int, y: Int, var z: Int) : Point(x, y) {
    }
}

run {
    open class Point(var x: Int, var y: Int) {
        open fun display() = "x: $x y: $y"
    }

    class Point3d(x: Int, y: Int, var z: Int): Point(x, y) {
        override fun display() = "x: $x y: $y z: $z"
    }
}

run {
    open class Point(var x: Int, var y: Int) {
        open fun display() = "x: $x y: $y"
    }

    class Point3d(x: Int, y: Int, var z: Int): Point(x, y) {
        final override fun display() = "x: $x y: $y z: $z"
    }
}

run {
    open class Point(var x: Int, var y: Int) {
        open fun display() = "x: $x y: $y"
    }

    class Point3d(x: Int, y: Int, var z: Int): Point(x, y) {
        override fun display() = "${super.display()} z: $z"
    }
}