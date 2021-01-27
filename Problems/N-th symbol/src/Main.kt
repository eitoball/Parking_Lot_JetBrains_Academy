fun main() {
    val str = readLine()!!
    val pos = readLine()!!.toInt()

    println("Symbol # $pos of the string \"$str\" is \'${str[pos - 1]}\'")
}