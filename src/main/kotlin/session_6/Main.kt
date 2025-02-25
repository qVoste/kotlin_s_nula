package session_6

fun main() {
    var numbers = arrayOf(1, 1, 3, 4, 5)
    print("массив: ")
    println(numbers.contentToString())

    numbers[1] = 2
    print("исправленный массив: ")
    println(numbers.contentToString())

    print("второй элемент массива: ")
    println(numbers[1])

    println("размер массива: ${numbers.size}")

    println("перебор массива:")
    for (number in numbers){
        println(number)
    }
}