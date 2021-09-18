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
       return " $EngineName"
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

/*data class Priviledge(val id: Int, val name: String)
open class user(val userName: String, private val id: String, protected var age: Int)
class PrivildgeUser(username: String, id: String, age: Int):user(username, id, age){
    private val priviledges = mutableListOf<Priviledge>()
    fun addPriviledge(priviledge: Priviledge){
        priviledges.add(priviledge)
    }

}*/
/*data class priviledge(val id: Int, val name: String)
open class User(val userName: String, private val id :Int, protected val age: Int)
class PrivildgeUser(username: String, id: Int, age: Int):User(username, id, age){
    private val addPriviledges =  mutableListOf<priviledge>()
    fun addPriviledge(Priviledge: priviledge){
        addPriviledges.add(Priviledge)
    }
    fun hasPriviledges(id: Int):Boolean{
        return priviledges.map{it.id}.contains(id)
    }
    fun about():String{
        return "$username $age"

    }
}*/
data class priviledge(val id:Int, val name: String)
open class User(val Username:String, private val id:Int, protected val age:Int)
class PrivildgeUser(username: String, id:Int, age:Int):User(username, id, age){
    private val addPriviledges = mutableListOf<priviledge>()
    fun addPriviledges(Priviledges:priviledge){
        addPriviledges.add(Priviledges)
    }
    /*fun hasPriviledges(id:Int):Boolean{
       // return Priviledges.map{it.id}.contains(id)
    }*/
}


//val mazdaEngine = Car.CarEngine("V8")
//Visibility Modifiers Public, private, internal and protected
//Public = visible from everywhere by other classes , subclasses , other files and other modules if no visibility modifier is specified it defaults to public
//private = is visible within the same class for classes and only within the same file for top level functions and other non-class definitions
//protected is visible within subclasses for class hierarchies
//Internal is visible within the same modules fot instance an intelliJ module