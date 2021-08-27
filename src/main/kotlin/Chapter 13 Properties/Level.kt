package `Chapter 13 Properties`

import kotlin.properties.Delegates

class Level(val id: Int, var boss: String, var unlocked: Boolean) {
    companion object {
        var highestLevel = 1

    }

    val leve1 = Level(1, "Chameleon", true)
    val level2 = Level(2, "Squid", false)
    val level3 = Level(3, "Chupacabra", false)
    val level4 = Level(4, "Yeti", false)

}

fun main(arg: Array<String>) {
    val highestLevel = Level.highestLevel
    println(highestLevel)


}

class DelegateLevel(val id: Int, val boss: String) {
    companion object {
        var highestLevel = 0
    }

    var unlocked: Boolean by Delegates.observable(false)
    {
        _, old, new ->
  if(new && id > highestLevel ){
      highestLevel = id
  }
        println("$old -> $new")
    }
}
class level(val id: Int, var boss: String, var unlocked: Boolean){
    companion object{
      @JvmStatic
        var highestLevel = 1
    }

    val new = level.highestLevel
}
