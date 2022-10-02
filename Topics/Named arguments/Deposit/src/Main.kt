import kotlin.math.pow

const val HUNDRED = 100.0
fun main() {
    val argument = readln()
    val value = readln().toInt()

    println(
        when (argument) {
            "amount" -> calculateAmount(amount = value)
            "percent" -> calculateAmount(percent = value)
            else -> calculateAmount(years = value)
        }
    )
}

fun calculateAmount(amount: Int = 1000, percent: Int = 5, years: Int = 10): Int {
    return (amount * (1 + percent / HUNDRED).pow(years)).toInt()
}