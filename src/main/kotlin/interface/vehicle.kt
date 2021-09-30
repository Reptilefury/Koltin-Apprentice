package `interface`

import jdk.incubator.vector.DoubleVector
import kotlin.math.PI

interface vehicle {
    fun Accelerating()
    fun Stop()
}

class Unicycle : vehicle {
    var peddling = false
    override fun Accelerating() {
        peddling = true
    }
    override fun Stop(){
        peddling = false
    }
}
class bus:vehicle{
    var speeding = false
    override fun Accelerating(){
       var  speeding = true
    }
    override fun  Stop(){
       var speeding= false
    }
}



class truck:vehicle{

    var speeding = false

    override fun Accelerating(){
        var speeding = true
    }
    override fun Stop(){
        var speeding = false
    }


}
enum class Direction{
    RIGHT,
    LEFT,
}
interface VehicleDirection{
    fun Accelerating()
    fun Stop()
    fun turn(direction: Direction)
    fun description():String
}
interface operationalDirectionVehicle{
    //fun Accelerating()
    //fun Stop()
    fun turn(direction: Direction)
    //fun description():String
}
class operationalDirection:operationalDirectionVehicle{
    override fun turn(direction: Direction) {
        println(direction)
    }
}
val car = operationalDirection()

interface SpaceVehicle{
    fun Accelerating()
    fun Stop(){
        println("whoa stop!!")
    }
}
interface WaterVessels{
    fun Sail()
    fun DropAnkor(){
        println("We are sinking Captain!!")
    }
}
class Yatch:WaterVessels{
    override fun Sail(){
        println("Rich people are sailing mate!!")
    }
}
class cargoShip: WaterVessels{
    override fun Sail() {
        println("Up and away!!")
    }

    override fun DropAnkor() {
        println("Yikes!!, we going down boys!! call for help!!")
    }
}

class LightFreighter: SpaceVehicle{
    override fun Accelerating(){
        println("Proceed to hyperSpace")
    }
}

class Starship : SpaceVehicle {
    override fun Accelerating() {
        println("Luke Iam your father!!")
    }

    override fun Stop() {
        super.Stop()
    }
}

interface VehicleProperties {
    val weight: Int
    val name: String
        get() = "Vehicle"
}

class Car : VehicleProperties {
    override val weight: Int = 2000
}

class Tank : VehicleProperties {
    override val weight: Int
        get() = 10000
    override val name: String
        get() = "Royce"
}

interface WheeledVehicle : vehicle {
    val numberOfWheels: Int
    val WheelSize: Double

}

class Bike : WheeledVehicle {
    var peddling = false
    var breaksApplied = false
    override val numberOfWheels: Int = 2
    override val WheelSize: Double
        get() = 40.0

    override fun Accelerating() {
        var peddling = true
        var breaksApplied = false
    }

    override fun Stop() {
        var peddling = false
        var breaksApplied = true
    }
}

class MotorBike : WheeledVehicle {
    var speeding = false
    var drifting = false
    override val numberOfWheels: Int = 2
    override val WheelSize: Double
        get() = 50.0

    override fun Accelerating() {
        var speeding = true
        var drifting = false
    }

    override fun Stop() {
        var speeding = false
        var drifting = false
    }
}

interface Area {
    val area: Double

}

fun main() {

    class Square(val side: Double) : Area {
        override val area: Double
            get() = side * side
    }

    class Triangle(val base: Double, val width: Double, val height: Double) : Area {
        override val area: Double
            get() = 0.5 * base * width * height
    }

    class Circle(val radius: Double) : Area {
        override val area: Double
            get() = PI * radius * radius
    }

    val square = Square(5.0)
    val triangle = Triangle(6.0, 4.0, 3.0)
    val circle = Circle(4.0)
    val shape = arrayOf(square, triangle, circle)

    println(shape.map { it.area })
    val StarWars = Starship()
    val richClass = Yatch()
    val MvFaina = cargoShip()
    val falcon = LightFreighter()
    println(StarWars.Accelerating())
    println(StarWars.Stop())
    println(richClass.Sail())
    println(MvFaina.DropAnkor())
    println(falcon.Accelerating())
    println(falcon.Stop())
    //println(car.turn(Direction.RIGHT))
        //println(car.turn(Direction.RIGHT))
}

//REPEAT and do default method implementations