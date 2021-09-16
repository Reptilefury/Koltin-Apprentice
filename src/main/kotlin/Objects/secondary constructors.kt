package Objects

class Person(val firstName: String, val lastName: String) {
    fun fullName() = "$firstName, $lastName"
}

class person constructor(val firstName: String, val lastName: String) {
    fun fullName() = "$firstName, $lastName"

}

open class shape {
    constructor(size: Int) {

    }

    constructor(size: Int, color: String) : this(size) {

    }
}

//nested and innerclasses
class car(val CarName: String){
    class CarEngine(val EngineName:String){
        override fun toString():String {
      //  return "$CarName, $EngineName"
        }
    }
}
class Car(val CarName: String) {
    inner class CarEngine(val EngineName: String) {
        override fun toString(): String {
            return "$CarName, $EngineName"
        }
    }
}
val mazda = Car("Mazda")
val MazdaEngine = car.CarEngine("V8")
fun main(){
    println(MazdaEngine)
}
//val mazdaEngine = Car.CarEngine("V8")
//Visibility Modifiers Public, private, internal and protected
//Public = visible from everywhere by other classes , subclasses , other files and other modules if no visibility modifier is specified it defaults to public
//private = is visible within the same class for classes and only within the same file for top level functions and other non-class definitions
//protected is visible within subclasses for class hierarchies
//Internal is visible within the same modules fot instance an intelliJ module