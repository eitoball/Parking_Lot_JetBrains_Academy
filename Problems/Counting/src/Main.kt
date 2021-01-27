fun main() {
    val n = readLine()!!.toInt()
    val a = IntArray(n)
    for (i in 0 until n) {
        a[i] = readLine()!!.toInt()
    }
    val m = readLine()!!.toInt()
    var c = 0
    for (i in a) {
        if (i == m) {
            ++c
        }
    }
    println(c)
}