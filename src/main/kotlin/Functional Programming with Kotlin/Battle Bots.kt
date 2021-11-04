package `Functional Programming with Kotlin`
import java.util.*

import sun.security.util.Event.report
import kotlin.random.Random


class Robot(val name: String){
    var strength: Int = 0
    private var health:Int = 0

    init {
        strength = Random.nextInt(100) + 10
        report("Created(Strength: $strength)")
    }

    fun report(message:String){
        println("$name: \t$message")
    }
}
/*
class Robot(val name : String){
    var strength:Int = 0
    private var health:Int =100

    init {

      strength = Random.nextInt(100) + 10
       report("Created(strength: $strength)")

    }


    fun report(message:String){
        println("$name: \t$message")
    }

}*/
