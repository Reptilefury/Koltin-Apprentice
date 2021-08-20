package Objects

object StudentRegistry {
    val AllStudents = mutableListOf<Student>()
    fun addStudent(student: Student){
        AllStudents.add(student)
    }
    fun removeStudent(student: Student){
        AllStudents.remove(student)
    }
    fun listAllStudents(){
        AllStudents.forEach {
            println(it.fullName)
        }
    }
    fun main(args: Array<String>){

    }
}