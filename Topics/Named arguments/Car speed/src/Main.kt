fun main() {
    val speed = readln().toInt()
    val limit = readln()

    println(
        if (limit == "no limit") {
            checkSpeed(actualSpeed = speed)
        } else {
            checkSpeed(actualSpeed = speed, speedLimit = limit.toInt())
        }
    )
}

fun checkSpeed(actualSpeed: Int, speedLimit: Int = 60) = if (actualSpeed > speedLimit) {
    "Exceeds the limit by ${actualSpeed - speedLimit} kilometers per hour"
} else {
    "Within the limit"
}