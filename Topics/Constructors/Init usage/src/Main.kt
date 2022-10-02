fun main() {
    val timerValue = readLine()!!.toInt()
    val timer = ByteTimer(timerValue)
    println(timer.time)
}

const val LOWER_LIMIT = -128
const val UPPER_LIMIT = 127
class ByteTimer(_time: Int) {
    var time = _time

    init {
        time = if (_time < LOWER_LIMIT) {
            LOWER_LIMIT
        } else if (_time > UPPER_LIMIT) {
            UPPER_LIMIT
        } else {
            _time
        }
    }
}