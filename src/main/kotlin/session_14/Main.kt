package session_14

open class Animal(val name: String) {
    fun does() {
        println("$name живет")
    }
}
class Capybara(name: String) : Animal(name) {
   fun chill() {
       println("$name чилит")
   }
}

fun main() {
    val capybara = Capybara("Bango")
    capybara.does()
    capybara.chill()
}