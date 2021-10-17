package `Chapter 18  Generics`

import java.awt.event.ItemListener


fun List<String>.toBulletedList(): String {
    val separator = "\n - "
    return this.map { "$it" }.joinToString(separator, prefix = separator, postfix = "\n")
}
/*fun<T> List<T>.toBulletedList():String{
    val separator = "\n - "
    return this.map{"$it"}.joinToString(separator, prefix = separator, postfix = "\n")
}*/
interface Checkable{
    fun checkIsOk():Boolean
}

class Mover<T:Checkable>(
    thingstoMove: List<T>,
    val truckHeightInches: Int = (12 * 12)
) {
    // thingsLeftInOldPlace thingsInTruck thingsInNewPlace
    private var thingsLeftInOldPlace = mutableListOf<T>()
    private var thingInTruck = mutableListOf<Any>()
    private var thingsInNewPlace = mutableListOf<Any>()
    private var thingsWhichFailCheck = mutableListOf<T>()

    init {
        thingsLeftInOldPlace.addAll(thingstoMove)
    }

    fun moveEverything(startingContainer: Container<T>?) {
        var currentContainer = startingContainer
        while (thingsLeftInOldPlace.count() > 0) {
            val item = thingsLeftInOldPlace.removeAt(0)
           if(item is BreakableThing){
               if (!item.isBroken){
                   if(currentContainer != null ){
                       if(!currentContainer.canAddAnotherItem()){
                           moveContainerToTruck(currentContainer)
                           currentContainer = currentContainer.getAnother()

                       }
                       currentContainer.addItem(item)
                       println("Packed your $item!")
                   } else {
                       thingInTruck.add(item)
                       println("Moved your $item to truck!")
                   }
                   thingInTruck.add(item)
                   print("Moved your $item to truck")
               } else{
                   println("Could not move your $item to truck")
               }
           } else {
               thingInTruck.add(item!!)
               println("Your $item was moved to truck mate!!")
           }

        }
        currentContainer?.let{moveContainerToTruck(it)}
    }
    interface Checkable{
        fun checkIsOk():Boolean
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
        if (!thingsWhichFailCheck.isEmpty()) {
            println("But we need to talk about your:${thingsWhichFailCheck}")
        }
    }
private fun MoveEverythingToTruck(container: Container<T>){
    thingInTruck.add(container)
    println("Moved Your container with ${container.contents()}")
}
    private fun moveContainerToTruck(container: Container<T>){
        thingInTruck.add(container)
        println("Moved your containers with your ${container.contents()} to the truck")
    }
private fun MoveEverythingIntoNewPlace(item:T){
    if(item.checkIsOk()){
       thingsInNewPlace.add(item)
       println("Moved your $item into new place!!")
    }

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

class CheapThing(val name: String):Checkable{
    override fun toString(): String {
        return name
    }
    override fun checkIsOk():Boolean = true
}

class BreakableThing(val name: String, var isBroken: Boolean= false ):Checkable{
    fun smash() {
        isBroken = true
    }

    override fun checkIsOk(): Boolean {
        return !isBroken
    }

    override fun toString():String{
        return name
    }

}
val television = BreakableThing("Samsung")
val BreakableThings = listOf(television,
      BreakableThing("Mirror"),
      BreakableThing("Desktops"),
      BreakableThing("Plates")
    )
interface Container<T>{
    fun canAddAnotherItem():Boolean
    fun addItem(item:T)
    fun canRemoveAnotherItem():Boolean
    fun removeItem():T
    fun getAnother():Container<T>
    fun contents():List<T>
}

fun main() {
   val expensiveMover = Mover(BreakableThings)
    expensiveMover.moveEverythingIntoNewPlace()
    expensiveMover.moveEverything(null)
    expensiveMover.finishMove()
    television.smash()
    val cheapThings = listOf(
        CheapThing("Coffee Table"),
        CheapThing("BeanBag chair"),
        CheapThing("Study table"),
        CheapThing("Carpet"),
    )

    val CheapMover = Mover(cheapThings)
    CheapMover.moveEverything(null)
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
//REPEAT GENERICS