package session_3

fun main() {
    println("сколько часов потратил чтобы понять ООП в kotlin?")
    val input = readLine()

    if (!input.isNullOrEmpty()){
        val hours = input.toIntOrNull()

        if (hours == 1){
            println("sigma")
        }else if(hours in 1..3){
            println("да уж пришлось попотеть")
        }else{
            print("сочувствую...")
        }

    } else{
        print("ну че ты? не стесняйся, скажи сколько часов")
    }
}