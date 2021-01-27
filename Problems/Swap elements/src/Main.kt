// The array numbers already exists. Write only exchange actions here.
val a = numbers.first()
val b = numbers.last()
numbers[0] = b
numbers[numbers.lastIndex] = a