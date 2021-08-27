package `Chapter 13 Properties`

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