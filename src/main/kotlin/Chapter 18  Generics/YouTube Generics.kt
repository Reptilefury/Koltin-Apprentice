package `Chapter 18  Generics`

open class mammal
open class Reptile
open class Bird
open class Fish
class Cat() : mammal()
class List1 {
    fun get(n: Int): Any? {
        return null
    }

    fun add(item: Any) {

    }
}

fun ListTest() {
    val list = List1()
    list.add(Cat())
    list.add(mammal())
    val cat = list.get(0)
    cat as Cat
}

class GenericList<ITEM> {
    fun get(n: Int): ITEM? {
        return null
    }

    fun add(item: ITEM) {

    }
}
fun ListTest2(){
    val Catlist = GenericList<Cat>()
    val mammalList = GenericList<mammal>()

    Catlist.add(Cat())
    mammalList.add(mammal())
    val cat = Catlist.get(0)
    cat as Cat
}
