fun main() {
    val n = readLine()!!.toInt()
    var larger = 0
    var smaller = 0
    var perfect = 0

    repeat(n) {
        when (readLine()!!.toInt()) {
            -1 -> ++smaller
            0 -> ++perfect
            1 -> ++larger
        }
    }

    println("$perfect $larger $smaller")
}