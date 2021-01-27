fun main() {
    var max = 1
    var last = -1
    var count = 0
    repeat(readLine()!!.toInt()) {
        val n = readLine()!!.toInt()
        if (last == -1) {
            last = n
            count = 1
        } else {
            if (last <= n) {
                ++count
            } else {
                if (max <= count) {
                    max = count
                }
                count = 1
            }
            last = n
        }
    }
    if (max <= count) {
        max = count
    }
    println(max)
}