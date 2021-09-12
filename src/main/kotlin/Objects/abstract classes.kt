package Objects


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
class Windows():Computer(){
    override fun OperatingSystem():String{
        return "Windows"
    }
}
class  MacBook(): Computer(){
    override fun OperatingSystem():String{
        return "MacBook"
    }
}
abstract class Processor(){
    abstract fun CpuThreads():String
}
class SingleCore():Processor(){
    override fun CpuThreads():String{
        return "SingleCore: 2 threads"
    }

}
class DualCore():Processor(){
 override fun CpuThreads(): String{
     return "Dual Core: 4 threads"
 }
}
abstract class Mammal(val BirthDate: String){
    abstract fun consumesFood(): String
}

class human(BirthDate:String): Mammal(BirthDate){

    override fun consumesFood():String {
        return "Human Eats Fruits too"
    }
}

class Elephants(BirthDate:String): Mammal(BirthDate){
    override fun consumesFood(): String {
     return "Elephants eat grass"
    }
}
  fun getFoodTypes(food:Mammal) = food.consumesFood()
fun getCpuPower(cpuType:Processor) = cpuType.CpuThreads()

fun getOPeratingSystem(computer:Computer) = computer.OperatingSystem()

fun main(){
    val human = human("22/8/21")
    val elephant = Elephants("22/9/22")
    println(getFoodTypes(human))
    println(getFoodTypes(elephant))
    val windows = Windows()
    val MacBook = MacBook()
    val singleCore = SingleCore()
    val dualCore = DualCore()

    println(getCpuPower(singleCore))
    println(getCpuPower(dualCore))
  println(getOPeratingSystem(MacBook))
    println(getOPeratingSystem(windows))
}

//BEGIN SEALED CLASS IN KOTLIN
//FINISH UP ON ABSTRACT CLASSES FIRST