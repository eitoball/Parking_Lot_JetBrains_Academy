import kotlin.math.sqrt

fun main() {
    when (readLine()!!) {
        "triangle" -> {
            val a = readLine()!!.toDouble()
            val b = readLine()!!.toDouble()
            val c = readLine()!!.toDouble()
            val s = (a + b + c) / 2
            println("${sqrt(s * (s - a) * (s - b) * (s - c))}")
        }
        "rectangle" -> {
            val h = readLine()!!.toDouble()
            val w = readLine()!!.toDouble()
            println("${h * w}")
        }
        "circle" -> {
            val r = readLine()!!.toDouble()
            println("${3.14 * r * r}")
        }
    }
}