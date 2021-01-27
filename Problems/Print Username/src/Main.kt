fun main() {
    val s = readLine()!!
    val n = if (s == "HIDDEN") {
        "secret user"
    } else {
        s
    }
    println("Hello, $n!")
}