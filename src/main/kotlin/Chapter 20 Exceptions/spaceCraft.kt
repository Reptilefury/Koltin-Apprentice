package `Chapter 20 Exceptions`

object SpacePort {
    fun investigateSpace(spaceCraft: SpaceCraft) {
        try {
            spaceCraft.launch()
        } catch (exception: Exception) {
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
            throw Exception("Out of fuel cannot take off")
            return
        }
        if (isConnectionAvailable) {
            throw Exception("No connection to earth cannot take off!!")
            return
        }
        if (isEngineInOrder) {
            throw Exception("Engine is out of fuel cannot take off!!")
            return
        }
        throw Exception("I'm trynna launch man so chill tf out")
        fuel -= 5
        throw Exception("I'm in space man chilling with some fucking aliens man, say: Cheese Mr Doobie Duh!!")
        throw Exception("Yoo I got some UFO's (Unidentified Flying Objects")
        isInSpace = true

    }

    fun sendMessageToEarth(message: String) {
        println("SpaceCraftToEarth:$message")
    }


}

//isConnectionAvailable= no connection with earth cannot take off, isEngineInOrder= the engine is broken cannot take off, isInSpace = true, fuel = 0
fun main() {
    val SpaceCraft = spaceCraft()
    SpacePort.investigateSpace(SpaceCraft())


}
//Will start on creating custom exceptions
