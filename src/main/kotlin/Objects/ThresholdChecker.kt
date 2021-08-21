package Objects

import Objects.Students.Companion.loadStudents

interface ThresholdChecker {
    val lower: Int
    val upper: Int
    fun isLit(value: Int): Boolean
    fun tooQuiet(value: Int): Boolean

}
fun main(){
    val theseGoToEleven = 11
    if(Threshold.isAboveThreshold(theseGoToEleven)){
        println("Needed that extra push over the cliff.")
        }else{
            println("Not bad")
        }
    val studentMap = mapOf("first_name" to "Neils", "last_name" to "Bohr")
    val student =  Students.loadStudents(studentMap)
    println(student)
    val thresholdChecker = object: ThresholdChecker{
        override val lower: Int
            get() = 7
        override val upper: Int
            get() = 10

        override fun isLit(value: Int)= value > upper

        override fun tooQuiet(value: Int)= value <= lower

    }
    if(thresholdChecker.isLit(11)){
        println("This is what we do.")
    } else{
        println("where can you go from there?")
    }
    if (thresholdChecker.tooQuiet(6)){
        println("Crank it up!")
    } else {
        println("Rockin!")
    }
}