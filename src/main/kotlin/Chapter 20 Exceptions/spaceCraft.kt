package `Chapter 20 Exceptions`

import java.util.*

object SpacePort {
    fun investigateSpace(SpaceCraft: spaceCraft) {
        try {
            SpaceCraft.launch()
        } catch (exception: OutOfFuelException) {
            SpaceCraft.sendMessageToEarth(exception.localizedMessage)
            SpaceCraft.refuel()
        }catch(exception: SpaceToEarthConnectionException){
            SpaceCraft.sendMessageToEarth(exception.localizedMessage)
            SpaceCraft.fixConnection()
        }catch(exception:BrokenEngineException){
            SpaceCraft.sendMessageToEarth(exception.localizedMessage)
        SpaceCraft.repairEngine()
        } finally {
            if(SpaceCraft.isInSpace){
                SpaceCraft.landing()
            } else{
                investigateSpace(SpaceCraft)
            }
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
fun refuel(){
    fuel += 5
    sendMessageToEarth("The spaceCraft is refueled")
}
    fun repairEngine(){
         isEngineInOrder = true
        sendMessageToEarth("All engine systems automatically repaired, prepare to launch!!")
    }
 fun fixConnection(){
     isConnectionAvailable = true
     sendMessageToEarth("Hello Earthlings!! can you terrestials hear me ")
     sendMessageToEarth("oh wait yeah connection is successful")
 }
    fun landing(){
        isInSpace = false
        sendMessageToEarth("We are landing up here, oh no I mean we ")
    }

    fun sendMessageToEarth(message: String) {
        println("SpaceCraftToEarth:$message")
    }


}
class OutOfFuelException: Exception("Out of fuel. Cannot take off")
class BrokenEngineException: Exception("The Engine is Broken cannot take off")
class SpaceToEarthConnectionException:Exception("SpaceCraft connection to Earth failed cannot take off!!")
/*
val date: Date =  try{
    Date(userInput) 
} catch (e: Exception){
  Date()
}
*/
//TRY CATCH AS an expression
//isConnectionAvailable= no connection with earth cannot take off, isEngineInOrder= the engine is broken cannot take off, isInSpace = true, fuel = 0
fun main() {
    val SpaceCraft = spaceCraft()
    SpacePort.investigateSpace(spaceCraft())


}
//Will start on creating custom exceptions
