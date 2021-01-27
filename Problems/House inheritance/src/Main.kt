fun main() {
    val rooms = readLine()!!.toInt()
    val price = readLine()!!.toInt()
    val house = House(rooms, price)
    println(totalPrice(house))
}

fun totalPrice(house: House): Int {
    val coefficient = when (house.type()) {
        "Cabin" -> 1.0
        "Bungalow" -> 1.2
        "Cottage" -> 1.25
        "Mansion" -> 1.4
        "Palace" -> 1.6
        else -> 0.0
    }
    return (house.basePrice() * coefficient).toInt()
}

class House(val rooms: Int, val price: Int) {
    fun type(): String {
        if (rooms <= 1) {
            return "Cabin"
        } else if (rooms in 2..3) {
            return "Bungalow"
        } else if (rooms == 4) {
            return "Cottage"
        } else if (rooms in 5..7) {
            return "Mansion"
        } else if (rooms in 8..10 || rooms > 10) {
            return "Palace"
        } else {
            return ""
        }
    }

    fun basePrice(): Int {
        if (price < 0) {
            return 0
        } else if (price > 1_000_000) {
            return 1_000_000
        } else {
            return price
        }
    }
}