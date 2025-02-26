package session_8

fun message_1(name: String): String {
    return "Привет, $name"
}

fun message_2(name: String) = "Hello, $name" //ашалеееть... как коротко

fun main(){
    println(message_1("пупсик"))
    println(message_2("pupsik"))
}