package `Chapter 11 classes`

import Objects.ScientistRepository

class Scientist private constructor(
    val id: Int,
    val firstName: String,
    val lastName: String,
) {


    companion object{

        @JvmStatic
        var currentId = 0
        fun newScientist(firstName: String, lastName: String): Scientist {
            currentId += 1
            return Scientist(currentId, firstName, lastName)
        }
    }
    var fullName = "$firstName $lastName"




}
class  A {
    companion object{
        fun create(): A  = A ()


    }
    fun show(){
        println("Showing name")
    }


}
fun main(args: Array<String>){
    val obj = A.create()
    obj.show()
    ScientistRepository.addScientist(Anna)
    ScientistRepository.addScientist(Jenna)
    ScientistRepository.addScientist(Lena)
    ScientistRepository.addScientist(Isla)

}
var Anna = Scientist.newScientist("Anna", "Seehaus")
var Jenna = Scientist.newScientist("Jenna", "Cottrel")
var Lena = Scientist.newScientist("Lena", "Bs")
var Isla = Scientist.newScientist("Isla", "Muller")
