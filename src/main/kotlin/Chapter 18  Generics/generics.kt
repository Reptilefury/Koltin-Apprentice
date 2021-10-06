package `Chapter 18  Generics`

import java.awt.geom.PathIterator

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
 }