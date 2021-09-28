package `interface`

interface vehicle {
    fun Accelerating()
    fun Stop()
}
class Unicycle:vehicle{
    var peddling = false
    override fun Accelerating(){
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
fun main(){
    println(car.turn(Direction.RIGHT))
    println(car.turn(Direction.RIGHT))
}

//REPEAT and do default method implementations