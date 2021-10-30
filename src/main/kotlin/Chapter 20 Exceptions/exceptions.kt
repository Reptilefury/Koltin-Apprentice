package `Chapter 20 Exceptions`
//someFunction //Another function //OneMoreFunction //
fun main() {
  return someFunction()
}
fun someFunction(){
    return AnotherFunction()
}
fun AnotherFunction(){
    return OneMoreFunction()
}
fun OneMoreFunction(){
    throw Exception("Some Error")
}
//Variables: isConnectionAvailable = No connection with earth cannot take off,
// isEngineInOrder= the engine is Broken cannot take off , isInSpace = , fuel= out of fuel cannot take off
class SpaceCraft{
    var isConnectionAvailable:Boolean = false
    var isEngineInOrder:Boolean = false
    var isInSpace:Boolean = false
    var fuel:Int = 0

    fun launch(){
        if(fuel < 5 ){
            sendMessageToEarth("Out of fuel cannot take off")
            return
        }
        if(isConnectionAvailable){
            sendMessageToEarth("No connection with earth cannot take off")
        return
        }
        if(isEngineInOrder){
            sendMessageToEarth("The engine is Broken cannot take off")
            return
        }


         //sendMessageToEarth("Trying to launch")
        sendMessageToEarth("Trying to launch")
        fuel -= 5
         //fuel -= 5
        //sendMessageToEarth("I'm in space!")
        sendMessageToEarth("I'm in space!")

        //sendMessageToEarth("I've found some extraterrestrials")
        sendMessageToEarth("I've found some extraterrestrials")
        isInSpace = true

    }
    fun sendMessageToEarth(message: String){
        println("SpaceCraft to Earth:$message")
    }
   /* fun launch(){
        if(fuel < 5) {
            sendMessageToEarth("Out of fuel. Can't take off")
            return
        }
        if (isEngineInOrder){
         sendMessageToEarth("The engine is broken. Cannot take off!!")
        return
         }
        if(!isConnectionAvailable){
            sendMessageToEarth("No connection with Earth. Cannot take off!")
            return
        }
        sendMessageToEarth("Trying to launch...")
         fuel -= 5
        sendMessageToEarth("I'm in space!")
        sendMessageToEarth("I've found some extraterrestrials")
        isInSpace = true

    }*/
  /*  fun sendMessageToEarth(message: String){
      println("SpaceCraft to Earth: $message")
    }*/
}
//Will start on throwing exceptions