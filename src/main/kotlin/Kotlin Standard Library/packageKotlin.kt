package `Kotlin Standard Library`


class Car{
    var model: String? = "Suv"
    var maxSpeed: String = "180KpH"
    val doors:Int = 10
}
val places = listOf("Paris," , "London", "New York")
var places2 = mutableListOf("Paris", "London", "New York")
var mutablePlaces = mutableListOf("Nairobi", "Nakuru", "Mombasa", "Kisumu")
var scores = mutableMapOf("Erick" to 9 , "Mark" to 12 ,"Wayne" to 8)
fun noSideEffecList(name:List<String>){
   println(name)
}

   fun sideEffecList(name:MutableList<String>){
       name.add("Joker!!")
   }
fun mutableVsImmutable(){
    val people = mutableListOf("Chloe" , "Lena", "Anna")
    noSideEffecList(people)
    sideEffecList(people)
    noSideEffecList(people)

}
fun printNames(names:List<String>){
    for(name in names){
        println(name)
    }
}
fun checkFirst(names:List<String>){
    if(names.firstOrNull() != null ){
        println(names.first())
    }else{
        println("No names")
    }
}
fun multiplicationBoard(size:Int){
    for(number in 1..size){
        println("|")
        for(otherNumber in 1..size){
            println("$otherNumber x $number = ${otherNumber * number }")
        }
        println()
    }

}
val numbers = listOf(1,3,56,66,68,80,99, 105,450)
/*fun linearContains(value:Int, numbers:List<Int>):Boolean {
    for(element in numbers){
      if(element == value){
          return true
      }
    }
    return false
}*/
fun linearContains(value:Int, numbers:List<Int>):Boolean{
    for(element in numbers){
        if(element  == value){
            return true
        }
    }
    return false
}

fun main(){
    fun multiplicationBoard(size:Int){
        for(number in 1..size){
            println("|")
            for(otherNumber in 1..size){
                println("$otherNumber x $number = ${otherNumber * number }")
            }
            println()
        }

    }
    multiplicationBoard(4)
 /*   multiplicationBoard(4)
    scores["Andrew"] = 0
    mutablePlaces.add("Kiambu")
    mutablePlaces.add(1,"Murang'a")
    println(mutablePlaces)
    fun printCar(car: Car?){
        val isCoupe = car.let{
            (it?.doors!! <= 2)
        }
        if(isCoupe == true){
            println("Coupes are really awsome!!")
        }else{
            println("something went wrong please try again!! ")

        }
    }*/

}