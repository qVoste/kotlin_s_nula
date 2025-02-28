package session_20

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val da = async {
        delay(2000L)
        42
    }

    println("Выполняем задачи...")
    val result = da.await()
    println("Результат: $result")
}