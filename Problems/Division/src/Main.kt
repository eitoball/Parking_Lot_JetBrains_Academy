// write your code here

fun divide(a: Long, b: Long): Double = a.toDouble() / b

/* Do not change code below */
fun main() {
    val a = readLine()!!.toLong()
    val b = readLine()!!.toLong()
    println(divide(a, b))
}