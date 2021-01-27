fun main() {
    val max = readLine()!!.toInt()
    var n = 1
    while (n * n <= max) {
        println(n * n)
        ++n
    }
}