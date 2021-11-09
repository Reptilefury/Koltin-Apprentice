package `Functional Programming with Kotlin`
import `Chapter 20 Exceptions`.AnotherFunction
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
private var random:Random= Random()

    init {
        strength = Random.nextInt(100) + 10
        report("Created(Strength: $strength)")
    }
fun damage(damage:Int){
    val blocked = random.randomBlock()
    if(blocked){
        report("Blocked attack")
        return
    }
    health -= damage
    report("Damage -$damage, health $health ")
    if(health <= 0){
        isAlive = false
    }

}
fun attack(robot: Robot){
    val damage = random.randomDamange(strength)
    robot.damage(damage.toInt())
}

    fun report(message:String){
        println("$name: \t$message")
    }
    object BattleField{
        fun BeginBattle(firstRobot: Robot, secondRobot:Robot,
          onBattleEnded:(Robot)-> Unit
                        ){
            var winner:Robot? = null
            battle(firstRobot, secondRobot)
            winner = if(firstRobot.isAlive) firstRobot else secondRobot
            onBattleEnded(winner)
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
    val onBattleEnded = {winner:Robot -> winner.report("won!")}
    Robot.BattleField.BeginBattle(firstRobot, secondRobot,::onBattleEnded)
}
fun onBattleEnded(winner:Robot){
    winner.report("Won!")
}
fun someFunction():()->Int{
    return ::AnotherFunction
}
fun AnotherFunction():Int{
    return Random.nextInt()
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
val Pow:(Int, Int)-> Double= {base, exponent -> Math.pow(base.toDouble(), exponent.toDouble(),)}
val root:(Int)->Double ={Math.sqrt(it.toDouble())}
var result = 0
val sum = {a:Int, b:Int->
    result = a + b
}
//sum(4,4)
/*fun String.print() = System.out.println(this)
val string = "Hello world"
string.print()*/
