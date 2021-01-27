import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val r1s = scanner.nextInt()
    val r1e = scanner.nextInt()
    val r2s = scanner.nextInt()
    val r2e = scanner.nextInt()
    val n = scanner.nextInt()
    println(n in r1s..r1e && n in r2s..r2e)
}