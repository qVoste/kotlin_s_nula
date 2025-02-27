package session_15

open class Animal(val name: String) {
    open fun does() {
        println("$name живет")
    }
}

class Capybara(name: String) : Animal(name) {
    override fun does() {
        println("$name чилит")
    }
}

class Cat(name: String) : Animal(name) {
    override fun does() {
        println("$name спит")
    }
}

fun main() {
    val capybara = Capybara("Bango")
    capybara.does()

    val cat = Cat("Мурзик")
    cat.does()
}