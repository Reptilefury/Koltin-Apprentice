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
enum class Direction{
    LEFT,
    RIGHT,
}
interface DirectionVehicle{
    fun Accelerating()
    fun Stop()
    fun turn(direction: Direction)
    fun  description():String
}