package session_11

class User(val name: String, var hobbi: String)

fun main(){
    val user = User("Олег", "хобихорсер")
    println("Пользователь: ${user.name}, ${user.hobbi}")
    user.hobbi = "квадробер"
    println("Пользователь: ${user.name}, ${user.hobbi}")
}