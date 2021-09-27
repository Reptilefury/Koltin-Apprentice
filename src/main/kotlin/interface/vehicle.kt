package `interface`

interface  vehicle {
    fun Accelerating()
    fun Stop()
}
class Unicycle:vehicle{
    var peddling = false

    override fun Accelerating(){
        var peddling = true
    }
    override fun Stop(){
        var peddling = false
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

enum class Direction {
LEFT,
RIGHT
}
interface vehicleDirection{
   fun accelerating()
   fun stop()
   fun turn(direction: Direction)
   fun description():String
}
interface optionalDirectionVehicle{
    //fun accelerating()
    //fun stop()
    fun turn(direction: Direction = Direction.RIGHT)
    //fun description():String
}
class optionalDirection:optionalDirectionVehicle{
    override fun turn(direction: Direction) {
        println(direction)
    }
}
val car = optionalDirection()
fun main(){
    println(car.turn())
    println(car.turn(Direction.RIGHT))
}
//REPEAT and do default method implementations