const val LOWER_TEMP = -92
const val UPPER_TEMP = 57
const val MOSCOW_AVERAGE = 5
const val HANOI_AVERAGE = 20
const val DUBAI_AVERAGE = 30

data class City(val name: String) {
    var degrees: Int = 0
        set(value) {
            field = if (value < LOWER_TEMP || value > UPPER_TEMP) {
                defaultTemp
            } else {
                value
            }
        }
    private val defaultTemp = when (name) {
        "Moscow" -> MOSCOW_AVERAGE
        "Hanoi" -> HANOI_AVERAGE
        "Dubai" -> DUBAI_AVERAGE
        else -> 0
    }
}        

fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val firstCity = City("Dubai")
    firstCity.degrees = first
    val secondCity = City("Moscow")
    secondCity.degrees = second
    val thirdCity = City("Hanoi")
    thirdCity.degrees = third

    // implement comparing here
    println(
        if (firstCity.degrees < secondCity.degrees && firstCity.degrees < thirdCity.degrees) {
            firstCity.name
        } else if (secondCity.degrees < firstCity.degrees && secondCity.degrees < thirdCity.degrees) {
            secondCity.name
        } else if (thirdCity.degrees < firstCity.degrees && thirdCity.degrees < secondCity.degrees) {
            thirdCity.name
        } else {
            "neither"
        }
    )
}