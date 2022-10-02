enum class Rainbow {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

fun main() {
    val color = readln()
    println(isInRainbow(color))
}

fun isInRainbow(color: String): Boolean {
    for (enum in Rainbow.values()) {
        if (color.uppercase() == enum.name) return true
    }
    return false
}