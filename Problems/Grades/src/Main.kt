fun main() {
    // put your code here
    val grades = arrayOf(0, 0, 0, 0)
    repeat(readLine()!!.toInt()) {
        when (readLine()!!.toInt()) {
            5 -> grades[3]++
            4 -> grades[2]++
            3 -> grades[1]++
            2 -> grades[0]++
        }
    }
    println(grades.joinToString(" "))
}