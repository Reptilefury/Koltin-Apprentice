package `Chapter 13 Properties`

import `Chapter 11 classes`.Lightbulb
import kotlin.properties.Delegates

class BootLinux {
    init {
        println(" Ubuntu Booted in 3s")
    }

}

class UbuntuBoot {
    val boot by lazy { BootLinux() }
}

class ComputerGate {
    init {
        println("Logic gate understood")
    }
}

class BooleanLogic {
    val bool by lazy {
        ComputerGate()
        //lazy enables the class to be instantiated only when needed
    }
    var marks: Int by Delegates.observable(50) { property, oldValue, newValue ->
        println("oldValue $oldValue")
        println("newValue $newValue")
        //delegate by observable observes changes in a variable


    }
    var age: Int by Delegates.vetoable(14) { property, oldAge, newAge ->

        println("oldAge $oldAge")
        println("newAge $newAge")
        newAge >= 14
    }
    var memory: Int by Delegates.vetoable(12) { property, oldRAM, newRAM ->
        println("oldRam $oldRAM")
        println("newRam $newRAM")
        newRAM >= 12
    }
}



class Circle(var Radius: Double = 0.0) {
    val pi by lazy { ((4.0 * Math.atan(1.0 / 5.0)) - Math.atan(1.0 / 239.0)) * 4.0 }

 val circumference: Double?
  get(){
      pi * Radius* 2
      return null
  }
    val circle: Circle = Circle(5.0)
    var Circumferenc = circle.circumference
}
class Lamp{
    lateinit var bulb: Lightbulb
}
fun main(array: Array<String>) {
    val bootable = UbuntuBoot()
    bootable.boot
    val boolLogic = BooleanLogic()
    boolLogic.bool
    val marks = BooleanLogic()
    marks.marks = 70
    marks.marks = 90
    marks.memory = 16
    marks.memory = 32
    //val Memory = BooleanLogic()
    //var bulb = Lamp()
    var lamp = Lamp()
    println(lamp.bulb)
    lamp.bulb = Lightbulb()
//Complete properties and Lateinit tomorrow
}




