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
/*fun main() {
    // println(c as A)
    //println(a as C)
    for (day in DayOfTheWeek.values()) {
        println("${day.ordinal }:  ${day.name}")
    }
    for(month in MonthsOfTheYear.values()){
        println("${month.ordinal}: ${month.name}")
    }
}*/

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

class Scientists {
    val Physics: MutableList<String> = mutableListOf<String>()
    fun TypeOfScientist(genius: String): Boolean {
        return Physics.add(genius)
    }

    val AlbertEinstein = TypeOfScientist("Physics Genius")
}
enum class ComputerBrands {
    Hp,
    AppleMacBookPro,
    DellXps,
    AcerPredator,
    Lenovo,

}

fun main() {
    val einstein = Scientists()
    println("is ALbert Einstein a genius? = ${einstein.AlbertEinstein}")

   // val dayIndex = 0
   /* val DayAtIndex = DayOfTheWeek.values()[dayIndex]
    println("day at $dayIndex is  $DayAtIndex")*/
    val MonthIndex = 0
    val MonthAtIndex = MonthsOfTheYear.values()[MonthIndex]
    println("the month at $MonthIndex is $MonthAtIndex")

    val tuesday = DayOfTheWeek.valueOf("Tuesday")
    println("tuesday is ${tuesday.ordinal}")
    val January = MonthsOfTheYear.valueOf("January")
    println("January is ${January.ordinal}")
    val FirstBrand = 0
    val FirstBrandAtComputers = ComputerBrands.values()[FirstBrand]
    println("The FirstBrand at $FirstBrand is $FirstBrandAtComputers")
    val Hp  =
}
