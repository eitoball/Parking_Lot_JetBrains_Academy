fun main() {
    val word = readLine()!!

    var count = 0
    outer@ for (i in word.indices) {
        val c = word[i]
        for (j in word.indices) {
            if (i == j) {
                continue
            }
            if (word[j] == c) {
                continue@outer
            }
        }
        ++count
    }
    println(count)
}