fun main() {
    val n = readLine()!!.toInt()
    val a = IntArray(n)
    for (i in 0 until n) {
        a[i] = readLine()!!.toInt()
    }
    val m = readLine()!!.toInt() % n

    val r = a.slice(a.size - m..a.lastIndex) + a.slice(0 until a.size - m)
    println(r.joinToString(" "))
}