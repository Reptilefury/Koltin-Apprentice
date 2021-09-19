package `Chapter 15 Advanced Classes`

 class Team{
     var players = mutableListOf<StudentAthlete>()
     val isEligible: Boolean
         get() {
             for (player in players) {
                 if (!player.isEligible) {
                     return false
                 }
             }
             return true
         }
 }

//FINISH ADVANCED CLASSES CHALLANGES TOMORROW
//CHALLANGES
open class A {
    init {
        println("A")
    }
}

open class B() : A() {
    init {
        println("I'm class B")
    }
}

open class C() : B() {
    init {
        println("I'm class C")
    }
}

val c = C()
val a = A()
fun main() {
    // println(c as A)
    //println(a as C)
    for (day in DayOfTheWeek.values()) {
        println("${day.ordinal }:  ${day.name}")
    }
    for(month in MonthsOfTheYear.values()){
        println("${month.ordinal}: ${month.name}")
    }
}

class StudentBaseballPlayer(
    firstName: String,
    lastName: String,
    val position: String,
    val battingAverage: Int,
    val number: Double
) : StudentAthlete(firstName, lastName) {

}

sealed class Resource {
    data class Success(val data: String) : Resource()
    data class Error(val error: String) : Resource()
    data class Loading(val loading: String) : Resource()

}

enum class DayOfTheWeek {
    Sunday,
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
}
enum class MonthsOfTheYear{
    January,
    Febuary,
    March,
    April,
    May,
    June,
    July,
    August,
    September,
    October,
    November,
    December
}