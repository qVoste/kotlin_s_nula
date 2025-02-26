package session_10

fun operate(a: Int, b: Int, operation: (Int, Int) -> Int): Int{ //функция в функции...
    return operation(a, b)
}

fun main() {
    val sum = operate(5, 5) {x, y -> x + y}
    val multiplication = operate(5, 5) { x, y -> x * y}

    println("Сумма: $sum")
    println("Произведение: $multiplication")
}