package Objects

import com.sun.org.apache.xml.internal.serialize.LineSeparator.Windows

abstract class mammal(val dateOfBirth: String){
    abstract fun consumesFood()
}
class Human(dateOfBirth: String):mammal(dateOfBirth){
    override fun consumesFood() {
    }
    fun CreateBirthCertificate(){

    }
    val human = Human("4TH OF FEB 2004")
   // val  mammal = mammal("4th Feb 2004")
}
abstract class Computer(){
    abstract fun OperatingSystem():String
}
class windows():Computer(){
    override fun OperatingSystem():String{
        return "Windows"
    }

}
class mac():Computer(){
    override fun OperatingSystem():String{
        return "MacOS"
    }
}
fun main(){
    val Windows = windows()
    val mac = mac()
}