package `Functional Programming with Kotlin`
import java.util.*

import kotlin.random.Random


class Robot(val name: String){
    var strength: Int = 0
    var isAlive:Boolean = true

     fun attack(robot:Robot){

         val damage = (strength * 0.1 + Random.nextInt(10).toInt() )

         robot.damage(damage.toInt())

     }

    fun damage(damage:Int){
        val blocked = Random.nextBoolean()
        if(blocked){
            report("Blocked attack")
            return
        }
        health -= damage
       report("Damage -$damage , health $health")

        if(health <= 0){
            isAlive = false
        }
    }



    private var health:Int = 0

    init {
        strength = Random.nextInt(100) + 10
        report("Created(Strength: $strength)")
    }

    fun report(message:String){
        println("$name: \t$message")
    }
    object BattleField{
        fun BeginBattle(firstRobot: Robot, secondRobot:Robot){
            var winner:Robot? = null
            battle(firstRobot, secondRobot)
            winner = if(firstRobot.isAlive) firstRobot else secondRobot
        }
        fun battle(firstRobot:Robot, secondRobot:Robot){
            firstRobot.attack(secondRobot)
            if(secondRobot.isAlive.not()){
                return
            }
            secondRobot.attack(firstRobot)
            if(firstRobot.isAlive.not()){
                return
            }
            battle(firstRobot, secondRobot)
        }
    }
}
fun main() {
   val firstRobot = Robot("Experimental Space Navigation")
   val secondRobot = Robot("Extra-terrestrial safety droid")
    Robot.BattleField.BeginBattle(firstRobot, secondRobot)
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
