package `Chapter 13 Properties`

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

class Student {
    var firstName: String? by NameDelegate()
     /*   set(value) {
            if (value != null && value.length > 5)
                field = value.trim().toUpperCase()
        }*/
    var lastName: String?  by NameDelegate()
       /* set(value) {
            if (value != null && value.length > 5)
                field = value.trim().toUpperCase()
        }*/
}

class NameDelegate {
    var formattedValue: String? = null
    operator fun setValue(
        thisRef: Any?,
        property: KProperty<*>,value: String?
    ){
    if (value != null && value.length > 5 ){
        formattedValue = value.trim().toUpperCase()
    }
    }
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String? {
        return formattedValue

    }
}
/*
class DelegatedLevel(val id: Int, var boss: String) {
    companion object {
        var highestLevel = 1
    }
    var unlocked: Boolean by Delegates.observable(false) {
            _, old, new ->
        if (new && id > highestLevel) {
            highestLevel = id
        }
        println("$old -> $new")
    }
     val  delegatedLevel1 = DelegatedLevel(id = 1 , boss = "Squid")
     val delegatedLevel2 = DelegatedLevel(id = 1, boss = "Chameleon")

}
fun main(arg: Array<String>){


    val  delegatedLevel1 = DelegatedLevel(id = 1 , boss = "Squid")
    val delegatedLevel2 = DelegatedLevel(id = 1, boss = "Chameleon")
    println(DelegatedLevel.highestLevel)
    delegatedLevel2.unlocked = true
    println(DelegatedLevel.highestLevel)
     delegatedLevel1.unlocked = true
    println(DelegatedLevel.highestLevel)



}*/

class  DelegatedLevel(val id: Int, var boss: String){
    companion object{
        var highestLevel = 1
    }
    var unlocked: Boolean by Delegates.observable(false){property, oldLevel, newLevel ->
    if (newLevel && id > highestLevel)
        highestLevel  = id
        println("$oldLevel -> $newLevel")


    }


}

val delegatedLevel1 = DelegatedLevel(id = 1, boss = "Chameleon")
val delegatedLevel2 = DelegatedLevel(id = 2 , boss = "Squid")

fun  main(arg: Array<String>){
    println(DelegatedLevel.highestLevel)
    delegatedLevel2.unlocked = true
    println(DelegatedLevel.highestLevel)
     var  checkLevel = DelegatedLevel
    checkLevel.highestLevel = 2
    println(checkLevel.highestLevel)

    checkLevel.highestLevel = 3
    println(checkLevel.highestLevel)

    checkLevel.highestLevel = 4
    println(checkLevel.highestLevel)
}























