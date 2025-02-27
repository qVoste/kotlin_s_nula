package session_16

interface Speakable {
    fun speak()
}

class Programmer : Speakable {
    override fun speak() {
        println("Программисту говорить можно)")
    }
}

class Designer : Speakable {
    override fun speak() {
        println("Дизайнеру говорить нельзя!")
    }
}

fun main() {
    val programmer = Programmer()
    val designer = Designer()

    programmer.speak()
    designer.speak()
}