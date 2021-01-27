fun main() {
    var c = 0
    repeat(readLine()!!.toInt()) {
        if (readLine()!!.toInt() > 0) {
            ++c
        }
    }
    println(c)
}