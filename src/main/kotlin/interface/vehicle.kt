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
class Starship:SpaceVehicle{
    override fun Accelerating(){
        println("Luke Iam your father!!")
    }

    override fun Stop() {
        super.Stop()
    }
}

fun main(){
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