fun main() {
    val n = readLine()!!.toInt()

    var max = -1
    repeat(n) {
        val n = readLine()!!.toInt()
        if (n % 4 == 0 && (max < n || max == -1)) {
            max = n
        }
    }
    println(max)
}