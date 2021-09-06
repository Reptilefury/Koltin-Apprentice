/*class Grade(var letter:String, var credit: Int, var Points: Int)
open class Person(var firstName: String , var lastName: String){
    open fun fullName() = "$firstName, $lastName"
}

class Student(firstName: String,lastName: String, val  grades:MutableList<Grade> = mutableListOf<Grade>()): Person(firstName, lastName){
     open fun recordGrade(grade: Grade) {
        grades.add(grade)
    }
}*/

//in Kotlin a class that inherits from another class is known as subclass or a derived class ,  and the class that gets inherited from is known as a superclass or
// a base class
//The rule for kotlin class inheritance include:
//- Single inheritance whereby a class can only inherit from one other class
// - A Kotlin class can only inherit from a class that is open(Open is a keyword that is used to show a class can be inherited from)
// There is no limit for subclassing , meaning you can sub class from a class that is also a subclass.
open class Grade(var points: Int, var letter: String, var credit: Int)
open class Person(var firstName: String, var lastName: String){
    fun fullName() = "$firstName, $lastName"
}
open class Student(firstName: String, lastName: String,var grades: MutableList<Grade> = mutableListOf<Grade>()):Person(firstName,lastName){
    fun recordGrade(grade: Grade){
        grades.add(grade)
    }
}
val John = Student("John", "Doe")
val Jane = Person("Jane", "Doe")
val Math = Grade(9, "B", 3)
fun main(){
   var printJohn =  John.fullName()
    var printJane =  Jane.fullName()
    println("$printJohn")
    println("$printJane")
    John.recordGrade(Math)

}
open class Students(firstName: String, lastName: String, var grades: MutableList<Grade> = mutableListOf<Grade>()): Person(firstName, lastName){
    open  fun recordGrade(grade: Grade){
        grades.add(grade)
    }
}
open class BandMember(firstName: String, lastName: String): Students(firstName, lastName){
 open   val minPracticeTime: Int
    get() {
        return 2
    }
}
// REPEAT THISSSSSSS