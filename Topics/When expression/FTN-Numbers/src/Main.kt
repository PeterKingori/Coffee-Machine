fun main() {
    val input = readln().toInt()
    val fibonacciNumbers = listOf(0, 1, 2, 3, 5, 8, 13, 21, 34, 55)
    val triangleNumbers = listOf(0, 1, 3, 6, 10, 15, 21, 28, 36, 45)
    val powerNumbers = listOf(1, 10, 100, 1000, 10_000, 100_000)
    println(
        when (input) {
            in fibonacciNumbers -> "F"
            in triangleNumbers -> "T"
            in powerNumbers -> "P"
            else -> "N"
        }
    )
}
