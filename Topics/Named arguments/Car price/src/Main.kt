// complete this function, add default values
const val AGE_DEVALUATION = 2000
const val SPEED_DEVALUATION = 100
const val SPEED_THRESHOLD = 120
const val MILEAGE_DEVALUATION = 200
const val MILEAGE_THRESHOLD = 10000
const val TRANSMISSION_VALUATION = 1500
const val INITIAL_PRICE = 20_000

fun carPrice(old: Int = 5, kilometers: Int = 100_000, maximumSpeed: Int = 120, automatic: Boolean = false) {
    val ageEffect = old * AGE_DEVALUATION
    val maxSpeedEffect = if (maximumSpeed == SPEED_THRESHOLD) {
        0
    } else if (maximumSpeed < SPEED_THRESHOLD) {
        (maximumSpeed - SPEED_THRESHOLD) * SPEED_DEVALUATION
    } else {
        (maximumSpeed - SPEED_THRESHOLD) * SPEED_DEVALUATION
    }
    val mileageEffect = kilometers / MILEAGE_THRESHOLD * MILEAGE_DEVALUATION
    val transmissionEffect = if (automatic) TRANSMISSION_VALUATION else 0

    val secondHandPrice = INITIAL_PRICE - ageEffect + maxSpeedEffect - mileageEffect + transmissionEffect
    println(secondHandPrice)
}