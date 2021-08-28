package `Chapter 11 classes`

import kotlin.properties.Delegates

class Lightbulb {
    companion object{
        const val maxCurrent  = 40
    }
    var current by Delegates.vetoable(0){
        _, _, new ->
        if(new > maxCurrent){
            println("Current too high back to previous setting.")
       false
        } else{
            true
        }
    }
}