package Objects
import Objects.StudentRegistry
object x {
    var x = 0

}
data class Student(val id: Int, val firstName: String, val lastName: String){
    var fullName = "$lastName , $firstName"

}
fun add(){
    StudentRegistry.addStudent(James)
    StudentRegistry.removeStudent(marie)
    StudentRegistry.listAllStudents()
}
val James = Student(6, "John", "Doe")
val marie = Student(1, "Marie", "Curie")
val albert = Student(2, "Albert", "Einstein")
val richard = Student(3, "Richard", "Feyman")
fun main(args: Array<String>){
    println(add())
    return add()
}
/*
object StudentRegistry{
    val allStudents = mutableListOf<Student>()
    fun addStudent(student: Student){
        allStudents.add(student)
    }
    fun removeStudent(student: Student){
        allStudents.remove(student)
    }
    fun listAllStudents(){
        allStudents.forEach {
            println(it.fullName)
        }
    }
}*/
