package `Chapter 20 Exceptions`


//isConnectionAvailable= no connection with earth cannot take off, isEngineInOrder= the engine is broken cannot take off, isInSpace = true, fuel = 0
fun main(){

    class spaceCraft {
        var isConnectionAvailable:Boolean = false
        var isEngineInOrder:Boolean = false
        var isInSpace:Boolean = false
        var fuel:Int = 0
        fun launch(){
            if(fuel<5){
                sendMessageToEarth("Out of fuel cannot take off")
                return
            }
            if(isConnectionAvailable){
                sendMessageToEarth("no connection to Earth Cannot take off")
                return
            }
            if(isEngineInOrder){
                sendMessageToEarth("the engine is broken cannot take off")
                return
            }
            sendMessageToEarth("Trying to launch so chill TF Out ")
            fuel -= 5
            sendMessageToEarth("I'm in Space, chillin with some aliens man!! say cheese Mr dOOBIE DUB!")
            sendMessageToEarth("Yoo I got some UFOs mfs (Unidentified flying Objects")
            isInSpace = true

        }
        fun sendMessageToEarth(message:String){
            println("SpaceCraftToEarth:$message")
        }

    }
}
