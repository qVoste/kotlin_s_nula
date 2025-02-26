package session_12

class User {
    var name: String
    val level: Int

    constructor(name: String, level: Int){
        this.name = name
        this.level = level
    }
}

fun main() {
    val user = User("Voste", 1)
    println("Персонаж: ${user.name}, уровень: ${user.level}")
}
