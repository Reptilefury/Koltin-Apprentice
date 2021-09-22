package `Chapter 15 Advanced Classes`

import java.util.*

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

enum class DayOfTheWeek(val isWeekend:Boolean) {
   /* companion object{
        fun Today():DayOfTheWeek{

        }*/
    //PiCKUP FROM HERE


    Monday(false),
    Tuesday(false),
    Wednesday(false),
    Thursday(false),
    Friday(true),
    Saturday(true),
    Sunday(true);
    companion object{
        fun today(): DayOfTheWeek {
      val calendarOfTheWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
            var adjustedDay = calendarOfTheWeek - 2
            val days = DayOfTheWeek.values()




            if(adjustedDay < 0 ){
                adjustedDay  += days.count()
            }
    val today = days.first {it.ordinal == adjustedDay}
         return today
        }


    }

}
enum class MonthsOfTheYear(val isVacation:Boolean){
    January(false),
    Febuary(false),
    March(false),
    April(false),
    May(false),
    June(false),
    July(false),
    August(false),
    September(false),
    October(false),
    November(true),
    December(true)
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

enum class Direction {
    EAST,
    WEST,
    SOUTH,
    NORTH;
}


fun main() {
    val today = DayOfTheWeek.today()

    val num = readLine()!!.toInt()
    for (i in 0 until 10) {
        val result = i * num
        println("$num * $i = $result")
    }
    val direction = Direction.values()
    val directions = Direction.values()[0]
    val directionsAt = directions
    println("$directionsAt")
    for (direction in Direction.values()) {
        println("${direction.ordinal}+ ${direction.name}")
    }


    val einstein = Scientists()
    println("is ALbert Einstein a genius? = ${einstein.AlbertEinstein}")

    val dayIndex = 0
    val DayAtIndex = DayOfTheWeek.values()[dayIndex]
    println("day at $dayIndex is  $DayAtIndex")
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
    val Hp = 0
    val HpAtIndex = ComputerBrands.values()[Hp]
    println("The brand at $Hp is $HpAtIndex")
    println("${DayAtIndex.ordinal} : ${DayAtIndex.name}, isWeekend: ${DayAtIndex.isWeekend}")
    println("${MonthAtIndex.ordinal}, ${MonthAtIndex.name} , Is Vacation: ${MonthAtIndex.isVacation}")

}

object KataSolution {
    fun multiplicationTable(size: Int): Array<IntArray> {
        return Array(size) { i -> IntArray(size) { (it + 1) * (i + 1) } }
    }
}

object KataSolution2 {
    fun multiplicationTable(size: Int): Array<IntArray> {
        return Array(size) { i -> IntArray(size) { (it + 1) * (i + 1) } }
    }
}
// return to code wars project