package session_13

class Grade(val grade_1: Int, val grade_2: Int, val grade_3: Int) {
    fun result(): Int {
        return (grade_1 + grade_2 + grade_3)/3
    }
}

fun main(){
    val grade = Grade(4, 2, 5)
    println("Оценка: ${grade.result()}")
}