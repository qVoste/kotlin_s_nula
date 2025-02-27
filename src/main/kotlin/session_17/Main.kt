package session_17

abstract class Sleep(val name: String) {
    abstract fun sleep()

    fun noSleep() {
        println("$name учит kotlin")
    }
}

class Student(name: String) : Sleep(name){
    override fun sleep() {
        println("$name спит")
    }
}

fun main(){
    val student = Student("Олег")
    student.sleep()
    student.noSleep()
}