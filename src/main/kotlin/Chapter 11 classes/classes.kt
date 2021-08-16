package `Chapter 11 classes`

import java.security.interfaces.DSAPublicKey

fun main(args: Array<String>) {
    class Person(var firstName: String, var lastName: String) {
        val fullName
            get() = "$firstName $lastName"

    }

    class PersonDetails(var height: Int, var Age: Int, var Nationality: String) {
        val details
            get() = "$height  and $Age  and $Nationality"

    }

    var john = PersonDetails(190, 24, "Belgian")

    var John = Person(firstName = "John", lastName = "McC")
    var homeOwner = John
    John.firstName = "john"
    homeOwner.lastName = "Dennis"
    println(John.fullName)
    println(john.Age)
    println(john.Nationality)
    println(john.details)
    println(John.firstName)
    println(homeOwner.firstName)
    println(homeOwner.fullName)
    //mini exercise
    fun memberOf(person: Person, group: Array<Person>): Boolean {
        return group.contains(person)

    }

    val groupWithJohn = arrayOf(
        Person("A", "B"),
        Person("C", "D"),
        John,
        Person("E", "F"),
        Person("G", "H")
    )
    val groupWithoutJohn = arrayOf(
        Person("A", "B"),
        Person("C", "D"),
        Person("E", "F"),
        Person("G", "H"),
        Person("I", "J")
    )
    println(memberOf(John, groupWithJohn))
    println(memberOf(John, groupWithoutJohn))
    //Methods and Mutability
    class Grade(val letter: String, val points: Double, val credits: Double)
    class Student(
        val firstName: String,
        val lastName: String,
        val grades: MutableList<Grade> = mutableListOf(),
        var credits: Double = 0.0
    ) {
        val gpa: Double
            get() {
                var totalPoints = 0.0
                grades.forEach {
                    totalPoints += it.points
                }
                return totalPoints / credits
            }

        fun recordeGrade(grade: Grade) {
            grades.add(grade)
            credits += grade.credits
        }

    }

    val jane = Student(firstName = "Jane", lastName = "Doe")
    val history = Grade(letter = "B", points = 9.0, credits = 3.0)
    val math = Grade(letter = "A", points = 16.0, credits = 4.0)
    jane.recordeGrade(history)
    jane.recordeGrade(math)

    println(jane.gpa)
    class Student1(var firstName: String, var lastName: String, var id: Int) {

        override fun hashCode(): Int {
            val prime = 31
            var result = 1

            result = prime * result + firstName.hashCode()
            result = prime * result + id
            result = prime * result + lastName.hashCode()

            return result
        }

        override fun equals(other: Any?): Boolean {
            if (this === other)
                return true

            if (other == null)
                return false

            if (javaClass != other.javaClass)
                return false

            val obj = other as Student1?

            if (firstName != obj?.firstName)
                return false

            if (id != obj.id)
                return false

            if (lastName != obj.lastName)
                return false

            return true
        }

        override fun toString(): String {
            return "Student1 (firstName=$firstName, lastName=$lastName, id=$id)"
        }

        fun copy(firstName: String = this.firstName,
                 lastName: String = this.lastName,
                 id: Int = this.id)
                = Student1(firstName, lastName, id)
    }
}



