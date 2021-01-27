fun main() {
    var pos = 1
    var max: Int? = null
    var maxPos = 1
    var line = readLine()
    while (line != null) {
        val cur = line.toInt()
        if (max == null || max < cur) {
            max = cur
            maxPos = pos
        }
        line = readLine()
        ++pos
    }
    println("$max $maxPos")
}