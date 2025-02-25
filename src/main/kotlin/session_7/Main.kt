package session_7

fun main() {
    println("____________________________________")
    val names_1 = mutableListOf("Олег", "Димон", "Сергей")
    println("лист: $names_1")
    names_1.removeAt(1) //удалил Димона
    println("лист без Димона: $names_1")

    println("____________________________________")
    val names_2 = mutableSetOf("Олег", "Димон", "Сергей")
    println("лист: $names_2")
    if (!names_2.contains("Юрчик")){
        names_2.add("Юрчик") //ну а куда ж без него
    }
    println("лист с Юрчиком: $names_2")

    println("____________________________________")
    val infoUser = mutableMapOf("Имя" to "Олег", "Возраст" to "17", "Увлечения" to "Хобихорсинг, Програмирование, Квадробинг")
    println("инфа по крутому челу: $infoUser")
    infoUser.put("Город", "Красноярск")
    println("инфа по крутому челу(с городом): $infoUser")

    println("____________________________________")
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7 ,8, 9, 10)
    println("все числа: $numbers")
    val chetnie = numbers.filter { it % 2 == 0 }
    print("четне числа: $chetnie")
}