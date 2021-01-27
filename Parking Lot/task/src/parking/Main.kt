package parking

data class Car(val registration: String, val color: String)

class PartkingSpots(val numberOfSpots: Int) {
    val parkingSpots = Array<Car?>(numberOfSpots) { null }

    fun isFull(): Boolean {
        for (spot in parkingSpots) {
            if (spot == null) {
                return false
            }
        }
        return true
    }

    fun isEmpty(): Boolean {
        for (spot in parkingSpots) {
            if (spot != null) {
                return false
            }
        }
        return true
    }

    fun park(registration: String, color: String): Int? {
        for (i in parkingSpots.indices) {
            if (parkingSpots[i] == null) {
                parkingSpots[i] = Car(registration, color)
                return i
            }
        }
        return null
    }

    fun leave(spot: Int): Boolean {
        if (spot !in parkingSpots.indices) {
            return false
        }
        if (parkingSpots[spot] == null) {
            return false
        }
        parkingSpots[spot] = null
        return true
    }

    fun status() {
        if (isEmpty()) {
            println("Parking lot is empty.")
            return
        }
        for (i in parkingSpots.indices) {
            val s = parkingSpots[i]
            if (s != null) {
                println("${i + 1} ${s.registration} ${s.color}")
            }
        }
    }

    fun reg_by_color(color: String) {
        val cars = mutableListOf<String>()
        for (c in parkingSpots) {
            if (c != null && color.equals(c.color, ignoreCase = true)) {
                cars.add(c.registration)
            }
        }
        if (cars.isEmpty()) {
            println("No cars with color $color were found.")
        } else {
            println(cars.joinToString(", "))
        }
    }

    fun spot_by_color(color: String) {
        val cars = mutableListOf<Int>()
        for (i in parkingSpots.indices) {
            val c = parkingSpots[i] ?: continue
            if (color.equals(c.color, ignoreCase = true)) {
                cars.add(i + 1)
            }
        }
        if (cars.isEmpty()) {
            println("No cars with color $color were found.")
        } else {
            println(cars.joinToString(", "))
        }
    }

    fun spot_by_reg(registration: String) {
        val cars = mutableListOf<Int>()
        for (i in parkingSpots.indices) {
            val c = parkingSpots[i] ?: continue
            if (registration.equals(c.registration, ignoreCase = true)) {
                cars.add(i + 1)
            }
        }
        if (cars.isEmpty()) {
            println("No cars with registration number $registration were found.")
        } else {
            println(cars.joinToString(", "))
        }

    }
}

fun main() {
    var parkingSpots: PartkingSpots? = null
    var exited = false
    loop@ while (!exited) {
        val args = readLine()!!.split(" ")
        when (args[0]) {
            "create" -> {
                val n = args[1].toInt()
                parkingSpots = PartkingSpots(n)
                println("Created a parking lot with $n spots.")
            }
            "park" -> {
                if (parkingSpots == null) {
                    println("Sorry, a parking lot has not been created.")
                    continue@loop
                } else {
                    val spot: Int? = parkingSpots.park(args[1], args[2])
                    if (spot == null) {
                        println("Sorry, the parking lot is full.")
                    } else {
                        println("${args[2]} car parked in spot ${spot + 1}.")
                    }
                }
            }
            "leave" -> {
                if (parkingSpots == null) {
                    println("Sorry, a parking lot has not been created.")
                    continue@loop
                } else {
                    val s = args[1].toInt()
                    parkingSpots.leave(s - 1)
                    println("Spot $s is free.")
                }
            }
            "status" -> {
                if (parkingSpots == null) {
                    println("Sorry, a parking lot has not been created.")
                    continue@loop
                } else {
                    parkingSpots.status()
                }
            }
            "spot_by_color" -> {
                if (parkingSpots == null) {
                    println("Sorry, a parking lot has not been created.")
                    continue@loop
                } else {
                    parkingSpots.spot_by_color(args[1])
                }
            }
            "spot_by_reg" -> if (parkingSpots == null) {
                println("Sorry, a parking lot has not been created.")
                continue@loop
            } else {
                parkingSpots.spot_by_reg(args[1])
            }
            "reg_by_color" -> {
                if (parkingSpots == null) {
                    println("Sorry, a parking lot has not been created.")
                    continue@loop
                } else {
                    parkingSpots.reg_by_color(args[1])
                }
            }
            "exit" -> exited = true
        }
    }
}
