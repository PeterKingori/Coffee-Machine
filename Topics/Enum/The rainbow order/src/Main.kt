enum class Rainbow {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

fun main() {
    val color = readln().uppercase()
    val rainbowColor: Rainbow = Rainbow.valueOf(color)
    println(rainbowColor.ordinal + 1)
}