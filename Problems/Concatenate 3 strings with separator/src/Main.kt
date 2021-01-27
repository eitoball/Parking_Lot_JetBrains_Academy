fun main() {
    val a = readLine()!!
    val b = readLine()!!
    val c = readLine()!!
    val d = readLine()!!
    val s = if (d == "NO SEPARATOR") {
        " "
    } else {
        d
    }
    println(arrayOf(a, b, c).joinToString(s))
}