import kotlin.math.hypot

fun perimeter(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double = 0.0, y4: Double = 0.0): Double {
    val perimeter: Double
    if (x4 == 0.0 && y4 == 0.0) {
        val side1 = hypot(x2 - x1, y2 - y1)
        val side2 = hypot(x3 - x2, y3 - y2)
        val side3 = hypot(x3 - x1, y3 - y1)
        perimeter = side1 + side2 + side3
    } else {
        val side1 = hypot(x2 - x1, y2 - y1)
        val side2 = hypot(x3 - x2, y3 - y2)
        val side3 = hypot(x4 - x3, y4 - y3)
        val side4 = hypot(x4 - x1, y4 - y1)
        perimeter = side1 + side2 + side3 + side4
    }
    return perimeter
}