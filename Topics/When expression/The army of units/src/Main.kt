fun main() {
    val units = readln().toInt()
    var category = ""

    when {
        units in 0 until 1 -> category = "no army"
        units in 1..4 -> category = "few"
        units in 5..9 -> category = "several"
        units in 10..19 -> category = "pack"
        units in 20..49 -> category = "lots"
        units in 50..99 -> category = "horde"
        units in 100..249 -> category = "throng"
        units in 250..499 -> category = "swarm"
        units in 500..999 -> category = "zounds"
        units >= 1000 -> category = "legion"
    }

    println(category)
}