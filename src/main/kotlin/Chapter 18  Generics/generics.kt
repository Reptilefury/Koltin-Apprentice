package `Chapter 18  Generics`

import java.awt.geom.PathIterator
import java.lang.management.ThreadInfo

fun List<String>.toBulletedList():String{
    val separator = "\n - "
    return this.map{"$it"}.joinToString(separator, prefix = separator, postfix = "\n")
}
/*fun<T> List<T>.toBulletedList():String{
    val separator = "\n - "
    return this.map{"$it"}.joinToString(separator, prefix = separator, postfix = "\n")
}*/

class Mover<T>(thingsToMove:List<T>,
val truckHeightInInches:Int = (12 * 12 )
               ){
    private var thingsLeftInOldPlace = mutableListOf<T>()
    private var thingsInTruck = mutableListOf<T>()
    private var thingsInNewPlace = mutableListOf<T>()

}

fun main(){
    val names = listOf("Ted", "Bob", "Alice", "Lena")
    println("Names: $names")
    val firstName = names.first()

    println(firstName)

    val things = mutableListOf<Any>(1,2,3)
      things.add("Steve")
    println("things: $things")
    val map = mapOf(
        Pair("one", 1 ),
        Pair("two", ""),
        Pair("Three",3)
    )
    //val one = map.get(1)
    val one = map[1]
   val valuesForKeysWithE = map.keys
       .filter {it.contains("e")}
       .map {"Value for $it: ${map[it]}"}
    println("Values for Keys with E: $valuesForKeysWithE")
    println("Names: ${names.toBulletedList()}")
//    println("Names: ${names.toBulletedList()}")
//println("Things: ${things.toBulletedList()}")

 }