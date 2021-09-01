package `Chapter 13 Properties`

import java.awt.Color
import kotlin.properties.Delegates

class Declaration {
    lateinit var myName: String
    fun setName(name: String) {
        myName = name
    }

    fun getName() = if (::myName.isInitialized) myName else "is not initialised"
}

fun main(array: Array<String>) {
    val declaration = Declaration()
    declaration.setName("Finall!!")
    println(declaration.getName())
    val user by lazy { UserDetail("Jimmy", 18) }
    var  mintChocolateChip = Icecream()
        //mintChocolate.name = ""
       //mintChocolateChip

        //REVIEW this code before
}

class UserDetail(val name: String, val age: Int) {
    init {
        println("The user's name is $name")
        println("The user's age is $age")
    }
}

class Icecream {
    val name: String = ""
    val ingredients: ArrayList<String> by lazy { arrayListOf<String>() }
}

class Car(val make: String, val color: String, val tank: FuelTank = FuelTank())
class FuelTank {
    companion object {
        var lowFuel = true
    }
          var level: Double by Delegates.observable(0.0){
              property, oldLevel, newLevel ->
              lowFuel = newLevel < 0.1
          }


}









