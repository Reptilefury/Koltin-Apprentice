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
open class Person(var firstName: String, var lastName: String) {
    fun fullName() = "$firstName, $lastName"
}

open class Student(firstName: String, lastName: String, var grades: MutableList<Grade> = mutableListOf<Grade>()) :
    Person(firstName, lastName) {
    fun recordGrade(grade: Grade) {
        grades.add(grade)
    }
}

val John = Student("John", "Doe")
val Jane = Person("Jane", "Doe")
val Math = Grade(9, "B", 3)
/*fun main() {
    var printJohn = John.fullName()
    var printJane = Jane.fullName()
    println("$printJohn")
    println("$printJane")
    John.recordGrade(Math)

}*/

/*open class Students(firstName: String, lastName: String, var grades: MutableList<Grade> = mutableListOf<Grade>()) :
    Person(firstName, lastName) {
    open fun recordGrade(grade: Grade) {
        grades.add(grade)
    }
}

open class BandMember(firstName: String, lastName: String) : Students(firstName, lastName) {
    open val minPracticeTime: Int
        get() {
            return 2
        }
}

class OboePlayer(firstName: String, lastName: String) : BandMember(firstName, lastName) {
    override val minPracticeTime: Int = super.minPracticeTime * 2
}*/
// REPEAT THISSSSSSS
open class Students(firstName: String, lastName: String, var grades: MutableList<Grade> = mutableListOf<Grade>()) :
    Person(firstName, lastName) {
    open fun recordGrade(grade: Grade) {
        grades.add(grade)
    }

    open class BandMember(firstName: String, lastName: String) : Student(firstName, lastName) {
        open val minPracticeTime: Int
            get() {
                return 2
            }

        class OboePlayer(firstName: String, lastName: String) : BandMember(firstName, lastName) {
            override val minPracticeTime = super.minPracticeTime * 2
        }
    }

    open class SuperComputer(var RAM: String, var CPU: String, var GPU: String)

    open class Dell(
        RAM: String,
        CPU: String,
        GPU: String,
        var totalSpecs: MutableList<SuperComputer> = mutableListOf<SuperComputer>()
    ) : SuperComputer(RAM, CPU, GPU) {
        open fun recordSpecs(specs:SuperComputer){
            totalSpecs.add(specs)
        }

    }
    open class HP(RAM: String, CPU: String, GPU: String, var HPspecs: MutableList<SuperComputer> = mutableListOf<SuperComputer>()): Dell(RAM, CPU, GPU){
        override fun recordSpecs(HPspecs:SuperComputer){
            totalSpecs.add(HPspecs)
        }
        class MacbookPro(RAM: String, CPU: String, GPU: String):HP(RAM, CPU, GPU,){

        }
    }
    }
open class Animal(var name: String){
    var children: MutableList<Animal> = mutableListOf<Animal>()
}

class Cat(name: String) : Animal(name)

/*
fun phoneBookName(person:Person): String {
    return "${person.firstName} ${person.lastName}"
}
val person = Person("John","Doe")
val oboePlayer = Person("Jane", "Doe")
val HallMornitor = Student("Jim","Rohn")
*/
fun phoneBookName(person: Person): String {
    return "${person.firstName}, ${person.lastName}"
}

val person = Person("John", "Doe")
val OboePlayer = Person("Jane", "Doe")
val HallMornitor = Person("James", "Doe")
fun AfterClassActivity(student: Student): String {
    return "Goes home"
}

fun AfterClassActivity(student: Students.BandMember): String {
    return "Goes to practice"
}
class StudentAthlete(firstName: String, lastName: String): Student(firstName, lastName){
    val failedClasses: MutableList<Grade> = mutableListOf<Grade>()
  override fun recordGrade(grade:Grade){
      super.recordGrade(grade)
     if(grade.letter == 'F'){
       failedClasses.add(Grade)
     }
  }

}

fun main() {
    val animal = Animal("Teddy Bear")
    val child = Animal("Teddy")
    animal.children.add(child)
    val cat = Cat("Cat")
    cat.children.add(Cat("Baby Cat"))
    println(HallMornitor is Students.BandMember.OboePlayer)
    println(HallMornitor !is Students.BandMember.OboePlayer)
    println(HallMornitor is Person)
   // (Students.BandMember.OboePlayer  as Student).minimumPracticeTime
    (HallMornitor as? Students.BandMember)?.minPracticeTime
    //AfterClassActivity(Students.BandMember.oboePlayer)
   // AfterClassActivity(oboePlayer as Students)
// PICK UP FROM HERE https://youtu.be/9PgHerHFH-A

}
//Polymorphism
