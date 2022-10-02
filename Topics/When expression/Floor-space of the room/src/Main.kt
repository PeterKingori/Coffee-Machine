import kotlin.math.sqrt

const val PI = 3.14
fun main() {
    val roomShape = readLine()
    var area = 1.0
    when (roomShape) {
        "triangle" -> {
            val lengthA = readLine()!!.toDouble()
            val lengthB = readLine()!!.toDouble()
            val lengthC = readLine()!!.toDouble()
            val s = (lengthA + lengthB + lengthC) / 2
            area = sqrt(s * (s - lengthA) * (s - lengthB) * (s - lengthC))
        }
        "rectangle" -> {
            val lengthA = readLine()!!.toDouble()
            val lengthB = readLine()!!.toDouble()
            area = lengthA * lengthB
        }
        "circle" -> {
            val radius = readLine()!!.toDouble()
            area = PI * radius * radius
        }
    }
    println(area)
}