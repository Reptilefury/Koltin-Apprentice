package `Conventions & Operator Overloading`

import java.awt.Color

fun main(){

    printUserInfo("John Doe")
    printUserInfo("Hannibal Lecter", 22)
    printUserInfo("Lew Bloom", 24, Color.BLUE)
}
fun printUserInfo(name:String, age: Int=0, favColor: Color= Color.BLUE){
    println("Name$name, Age:$age, Favourite Color: $favColor")
}





    //Kitten("Fluffy")