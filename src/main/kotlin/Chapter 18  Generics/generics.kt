package `Chapter 18  Generics`

import javax.swing.border.EmptyBorder


fun List<String>.toBulletedList(): String {
    val separator = "\n - "
    return this.map { "$it" }.joinToString(separator, prefix = separator, postfix = "\n")
}
/*fun<T> List<T>.toBulletedList():String{
    val separator = "\n - "
    return this.map{"$it"}.joinToString(separator, prefix = separator, postfix = "\n")
}*/


class Mover<T>(
    thingstoMove: List<T>,
    val truckHeightInches: Int = (12 * 12)
) {
    // thingsLeftInOldPlace thingsInTruck thingsInNewPlace
    private var thingsLeftInOldPlace = mutableListOf<T>()
    private var thingInTruck = mutableListOf<T>()
    private var thingsInNewPlace = mutableListOf<T>()

    init {
        thingsLeftInOldPlace.addAll(thingstoMove)
    }

    fun moveEverything() {
        while (thingsLeftInOldPlace.count() > 0) {
            val item = thingsLeftInOldPlace.removeAt(0)
            thingInTruck.add(item)
            println("Moved your $item to truck!!")
        }
    }

    fun moveEverythingIntoNewPlace() {
        while (thingInTruck.count() > 0) {
            val item = thingInTruck.removeAt(0)
            thingsInNewPlace.add(item)
            print("Your $item was moved into your new place!!")
        }
    }

    fun finishMove() {
        println("Ok we are done! we were able to move your ${"Bullted list function missing"} ")
    }
}

//Kotlin generics explained in full depth
class Company<T>(text: T) {
    val x = text

    init {
        println(x)
    }
}

class Event<T, V>(value: T? = null, data: V? = null) {
    init {
        if (value != null) {
            println(value.toString().length)
        } else println("Empty parameter")
    }

}

class CheapThing(val name: String) {
    override fun toString(): String {
        return name
    }
}
fun main() {
    val cheapThings = listOf(
        CheapThing("Coffee Table"),
        CheapThing("BeanBag chair"),
        CheapThing("Study table"),
        CheapThing("Carpet"),
        )

  val  CheapMover = Mover(cheapThings)
    CheapMover.moveEverything()
    CheapMover.moveEverythingIntoNewPlace()
    CheapMover.finishMove()
    Event<String, Int>("Testing Generics!", 12)
    Event<Int, String>(256, "Ok so this is 256")
    Event<Int, String>(12, "ok let's do it again I think I blinked!!")
    Event<String, Int>()
    val name: Company<String> = Company<String>("Trying to style this generics!!")
    val rank: Company<Int> = Company<Int>(12)

    val names = listOf("Ted", "Bob", "Alice", "Lena")
    println("Names: $names")
    val firstName = names.first()

    println(firstName)

    val things = mutableListOf<Any>(1, 2, 3)
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