package `Chapter 13 Properties`

import kotlin.math.roundToInt

class Contact(var fullName: String,val emailAddress: String){
    val contact = Contact(fullName = "Grace", emailAddress = "grace@gmail.com")
    var name = contact.fullName
    val email  = contact.emailAddress
//    contact.fullName = "Jenna"

    fun main(){
        println(name)
        println(email)
    }
    var Grace = contact.fullName

}
class Contact2(val fullName:String, emailAddress:String) {

    var contact2 = Contact2(fullName = "Grace", emailAddress = "grace@gmail.com")
    //contact2.fullName = Grace
}
class Contact3(val fullName: String, emailAddress: String, var type: String = "Friend"){

var contact3 = Contact3("Grace", "grace@gmail.com")

}

class Person(val firstName: String, val lastName: String){
    var fullName = "$firstName $lastName"
}
var person  = Person(firstName ="Grace", lastName = "Hopper")
fun main(){
    person.fullName
    
}
class Address(var address1: String, var state: String) {
    var address2: String? = null
    var city: String = ""
    init {
        address1 = " "
        state = " "

    }
    val address = Address("", "")
}
/*class Tv(var height: Double, var width: Double){
    val diagonal : Int
    get(){
        val result = Math.sqrt(height * height * width* width)
        return result.roundToInt()
    }
    val tv = Tv(50.0, 95.0)
    val size = tv.diagonal

fun main() {
    tv.width = tv.height
    val diagonal = tv.diagonal
}


}*/
/*class TV(var height: Double, var width: Double){
var diagonal: Int
    // 2
    get() {
        val result = Math.sqrt(height * height + width * width)
        return result.roundToInt()
    }
    set(value) {
        // 3
        val ratioWidth = 16.0
        val ratioHeight = 9.0
        // 4
        val ratioDiagonal = Math.sqrt(ratioWidth * ratioWidth + ratioHeight * ratioHeight)
        height = value.toDouble() * ratioHeight / ratioDiagonal
        width = height * ratioWidth / ratioHeight
    }
} */
class Tv(var height: Double, var width:Double){
    var diagonal: Int
    get() {
        val result = Math.sqrt(height * height + width * width)

        //    val result = Math.sqrt(height * height + width * width)
        return result.roundToInt()

    }
    set(value){
        val ratioWidth = 16.0
        val ratioHeight = 9.0
        val ratioDiagonal = Math.sqrt(ratioHeight * ratioHeight + ratioWidth * ratioWidth )
   height = value.toDouble() * ratioHeight/ratioDiagonal
        width = height * ratioWidth / ratioHeight
    }

}
class Persons{
    var name: String = "defaultValue"
    get() = field
    set(value){
        field = value
    }
    fun main() {
        var person = Persons()

    }
}
fun main(args: Array<String>){
    var person = Persons()
    person.name = "Tom"
    println(person.name)

}
class Computer{
    var Memory : String = "12 Gigs"
    get() = field
    set(value){
        field = value
    }
    var Storage: Int = 12
    get()=field
    set(value){
        field = value
    }
    var CPU: String = "16 cores"
    get()=field
    set(value){
        field = value
    }

    fun main() {
        var computer = Computer()
        computer.Memory = "12Gigs"
        computer.Storage = 12
        computer.CPU =  "16cores"

      println(computer.Memory)
      println(computer.Storage)
      println(computer.CPU)
    }
}



