fun main() {
    val scanner = java.util.Scanner(System.`in`)
    val n = scanner.nextInt()
    val s = scanner.nextInt()
    val e = scanner.nextInt()
    println(n in s..e || n in e..s)
}