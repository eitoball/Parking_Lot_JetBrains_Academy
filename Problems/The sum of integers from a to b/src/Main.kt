fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    var sum = 0
    for (n in a..b) {
        sum += n
    }
    println(sum)
}