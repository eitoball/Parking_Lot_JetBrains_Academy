import java.util.*
import kotlin.comparisons.*

fun main() {
    val scanner = Scanner(System.`in`)
    val x1 = scanner.nextInt()
    val y1 = scanner.nextInt()
    val z1 = scanner.nextInt()
    val x2 = scanner.nextInt()
    val y2 = scanner.nextInt()
    val z2 = scanner.nextInt()

    val a1 = arrayOf(x1, y1, z1).sortedArray()
    val a2 = arrayOf(x2, y2, z2).sortedArray()

    if (x1 * y1 * z1 > x2 * y2 * z2) {
        if (a1[0] >= a2[0] && a1[1] >= a2[1] && a1[2] >= a2[2]) {
            println("Box 1 > Box 2")
        } else {
            println("Incomparable")
        }
    } else if (x1 * y1 * z1 < x2 * y2 * z2) {
        if (a1[0] <= a2[0] && a1[1] <= a2[1] && a1[2] <= a2[2]) {
            println("Box 1 < Box 2")
        } else {
            println("Incomparable")
        }
    } else {
        if (a1.contentEquals(a2)) {
            println("Box 1 = Box 2")
        } else {
            println("Incomparable")
        }
    }
}