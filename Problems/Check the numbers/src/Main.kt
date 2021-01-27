fun main() {
    val n = readLine()!!.toInt()
    val a = IntArray(n)
    for (i in 0 until n) {
        a[i] = readLine()!!.toInt()
    }
    val (p, m) = readLine()!!.split(" ").map { it.toInt() }
    var r = "YES"
    for (i in 0 until n - 1) {
        if (a[i] == p && a[i + 1] == m || a[i] == m && a[i + 1] == p) {
            r = "NO"
        }
    }
    println(r)
}