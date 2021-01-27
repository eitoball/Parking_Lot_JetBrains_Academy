import kotlin.math.roundToInt

fun main() {
    val n1 = readLine()!!.toInt()
    val n2 = readLine()!!.toInt()
    val n3 = readLine()!!.toInt()
    val s1 = (n1 / 2 + (n1 % 2)
    val s2 = (n2 / 2) + (n2 % 2)
    val s3 = (n3 / 2) + (n3 % 2)
    println(s1 + s2 + s3)
}