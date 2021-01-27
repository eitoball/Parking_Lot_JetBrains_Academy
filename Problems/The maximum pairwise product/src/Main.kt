fun maxPairWiseProduct(a: IntArray): Int {
    val n = a.size
    var m = 0
    for (i in 0 until n - 1) {
        for (j in i + 1 until n) {
            val r = a[i] * a[j]
            if (m < r) {
                m = r
            }
        }
    }
    return m
}

fun main() {
    val n = readLine()!!.toInt()
    val a = IntArray(n)
    for (i in 0 until n) {
        a[i] = readLine()!!.toInt()
    }
    println(
        if (n > 1) {
            maxPairWiseProduct(a)
        } else {
            a[0]
        }
    )
}