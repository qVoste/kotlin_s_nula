package session_19

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.coroutines.*

fun main() = runBlocking () {
    println("Привет")
    delay(2000L)
    println("Программа началась")

    launch {
        delay(2000L)
        println("Привет из корутины 2")
    }

    launch {
        delay(2000L)
        println("Привет из корутины 1")
    }

    println("Программа продолжаеться...")
}