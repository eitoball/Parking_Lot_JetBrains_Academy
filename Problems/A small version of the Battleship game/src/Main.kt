fun main() {
    val (x1, y1) = readLine()!!.split(" ").map { it.toInt() }
    val (x2, y2) = readLine()!!.split(" ").map { it.toInt() }
    val (x3, y3) = readLine()!!.split(" ").map { it.toInt() }

    var xs = emptyArray<Int>()
    for (x in 1..5) {
        if (x == x1 || x == x2 || x == x3) {
            continue
        }
        xs = xs.plus(x)
    }
    var ys = emptyArray<Int>()
    for (y in 1..5) {
        if (y == y1 || y == y2 || y == y3) {
            continue
        }
        ys = ys.plus(y)
    }
    println(xs.joinToString(" "))
    println(ys.joinToString(" "))
}