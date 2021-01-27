fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val d = readLine()!!.toInt()

    for (x in 0..1000) {
        val r = a * x * x * x + b * x * x + c * x + d
        if (r == 0) {
            println(x)
        }
    }
}