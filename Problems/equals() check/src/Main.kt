data class Client(val name: String, val age: Int, val balance: Int) {
    override fun equals(other: Any?): Boolean {
        return if (other is Client) {
            other.name == name && other.age == age
        } else {
            super.equals(other)
        }
    }
}

fun main() {
    val client1 = Client(readLine()!!, readLine()!!.toInt(), readLine()!!.toInt())
    val client2 = Client(readLine()!!, readLine()!!.toInt(), readLine()!!.toInt())
    println(client1 == client2)
}