class Point(val x: Int, val y: Int) {
    operator fun plus(point: Point) =
            Point(this.x + point.x, this.y + point.y)
}

val p1 = Point(1, 2)
val p2 = Point(3, 4)
val p3 = p1 + p2

println("x=${p3.x} y=${p3.y}")
