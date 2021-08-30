package `Chapter 11 classes`

import kotlin.properties.Delegates

class Lightbulb {
    companion object {
        const val maxCurrent = 40
    }

    var current by Delegates.vetoable(0) { _, _, new ->
        if (new > maxCurrent) {
            println("Current too high back to previous setting.")
            false
        } else {
            true
        }
    }
}

class  StudentHeavy{
    init {
        println("This class has been initialized")
    }

}
class Student{
    val heavy by lazy { StudentHeavy() }
}
/*fun main(){
    val student = Student()
      student.heavy
}*/
class Computer{
    init {
        println(" The operating system is booting up")
    }
}
class  ComputerBoot{
    val operatingSystem by lazy { Computer() }
    var  memory: Int by Delegates.observable(12) {property, oldMemory, newMemory ->

        println(" OldMemory: $oldMemory")
        println("newMemory: $newMemory")
    }
    var cpu:Int by Delegates.vetoable(7){property, oldCPU, newCPU ->
        println("oldCpu $oldCPU")
        println("newCpu $newCPU")
        newCPU >= 7

    }


}

/*fun main(){
    val OperatingSystem = ComputerBoot()
    OperatingSystem.operatingSystem
    *//*OperatingSystem.memory = 16
    OperatingSystem.memory = 32
    OperatingSystem.memory = 64
    OperatingSystem.memory = 128
    OperatingSystem.memory = 264*//*

    OperatingSystem.cpu = 9
    println(OperatingSystem.cpu)
    OperatingSystem.cpu = 5
    println(OperatingSystem.cpu)
    OperatingSystem.cpu = 11
    println(OperatingSystem.cpu)
}*/
class  LinuxBoot{
    init {
        println("The linux system has booted up")
    }
}
class Boot{
    val Bootable by lazy { LinuxBoot() }
}
 fun main() {
     val light = Lightbulb()
     light.current = 50
     var current = light.current
     light.current = 40
     current = light.current
     var bootable = Boot()
     bootable.Bootable
     //println(bootable.Bootable)
 }





