package `Chapter 20 Exceptions`

object SpacePort {
    fun investigateSpace(spaceCraft: SpaceCraft) {
        try {
            spaceCraft.launch()
        } catch (exception: OutOfFuelException) {
            spaceCraft.sendMessageToEarth(exception.localizedMessage)
        }catch(exception: SpaceToEarthConnectionException){
            spaceCraft.sendMessageToEarth(exception.localizedMessage)
        }catch(exception:BrokenEngineException){
            spaceCraft.sendMessageToEarth(exception.localizedMessage)
        }
    }
}

class spaceCraft {
    var isConnectionAvailable: Boolean = false
    var isEngineInOrder: Boolean = false
    var isInSpace: Boolean = false
    var fuel: Int = 0
    fun launch() {
        if (fuel < 5) {
            throw OutOfFuelException()
            sendMessageToEarth("The tank is filled")
            return
        }
        if (isConnectionAvailable) {
            throw SpaceToEarthConnectionException()

            return
        }
        if (isEngineInOrder) {
            throw BrokenEngineException()
                 return
        }

        throw Exception("I'm trynna launch man so chill tf out")
        fuel -= 5
        throw Exception("I'm in space man chilling with some fucking aliens man, say: Cheese Mr Doobie Duh!!")
        throw Exception("Yoo I got some UFO's (Unidentified Flying Objects")
        isInSpace = true

    }

    fun repairEngine(){
        isEngineInOrder= true
        sendMessageToEarth("The engine is in order")
    }

    fun sendMessageToEarth(message: String) {
        println("SpaceCraftToEarth:$message")
    }


}
class OutOfFuelException: Exception("Out of fuel. Cannot take off")
class BrokenEngineException: Exception("The Engine is Broken cannot take off")
class SpaceToEarthConnectionException:Exception("SpaceCraft connection to Earth failed cannot take off!!")


//isConnectionAvailable= no connection with earth cannot take off, isEngineInOrder= the engine is broken cannot take off, isInSpace = true, fuel = 0
fun main() {
    val SpaceCraft = spaceCraft()
    SpacePort.investigateSpace(SpaceCraft())


}
//Will start on creating custom exceptions
