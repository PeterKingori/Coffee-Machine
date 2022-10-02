fun main() {
    val (firstNumber, operator, secondNumber) = readln().split(" ")
    val num1 = firstNumber.toLong()
    val num2 = secondNumber.toLong()

    val result = when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "/" -> if (num2 == 0L) "Division by 0!" else num1 / num2
        "*" -> num1 * num2
        else -> "Unknown operator"
    }

    println(result)
}