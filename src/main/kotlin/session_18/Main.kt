package session_18

fun main() {
    val numbers = listOf(10, 20, 25, 0, 50)

    for (num in numbers) {
        try {
            println("100 / $num = ${100/num}")
        }catch (e: ArithmeticException) {
            println("Ошибка: ${e.message}")
        }
    }
}