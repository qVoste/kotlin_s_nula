package session_2

var a: Int = 1
var b = 1 //писать тип не обязательно

val result: Int = a + b //константа

fun main() {
    b = 100
    println("немного математики? $a + $b = $result")
    print("стоп, знак доллара? да вы на приколе. $b процентов под чем то язык создавали")
}