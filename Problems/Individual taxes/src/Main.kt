fun main() {
    val n = readLine()!!.toInt()
    val incomes = IntArray(n)
    for (i in 0 until n) {
        incomes[i] = readLine()!!.toInt()
    }
    val percentages = IntArray(n)
    for (i in 0 until n) {
        percentages[i] = readLine()!!.toInt()
    }
    val taxes = IntArray(n)
    for (i in 0 until n) {
        taxes[i] = incomes[i] * percentages[i]
    }
    var pos = 0
    var max = taxes[0]
    for (i in 1 until n) {
        if (max < taxes[i]) {
            pos = i
            max = taxes[i]
        }
    }
    println(pos + 1)
}