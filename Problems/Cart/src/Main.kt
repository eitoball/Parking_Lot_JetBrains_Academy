fun main() {
    val productType = readLine()!!
    val price = readLine()!!.toInt()
    val product = Product(productType, price)
    println(totalPrice(product))
}

fun totalPrice(product: Product): Int {
    return (product.price + product.productTax() * product.price).toInt()
}

class Product(val productType: String, val price: Int) {
    fun productTax(): Double {
        return when (productType) {
            "headphones" -> 0.11
            "smartphone" -> 0.15
            "tv" -> 0.17
            "laptop" -> 0.19
            else -> 0.0
        }
    }
}
