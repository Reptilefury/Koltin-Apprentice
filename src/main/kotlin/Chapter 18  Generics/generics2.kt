package `Chapter 18  Generics`

class ArrayUtil<T>(private val array: Array<T>) {
    fun findElement(element: T, foundElement: (index: Int, element: T?) -> Unit) {
        for (i in array.indices) {
            if (array[i] == element) {
                foundElement(i, array[i])
                return
            }
        }
        foundElement(-1, null)
        return
    }
}

fun <T, X> TestingParameter(parameter1: T, parameter2: Int) {
    println("$parameter1 and $parameter2")
}
class  EvenList<T>(val list:List<T>){
   fun Items():List<T> {
       return list.filterIndexed { index, value -> index % 2 == 0  }
   }
}
/*interface  Container<T>{
   *//* fun canAddAnotherItem():Boolean
    fun addItem(item: T)
    fun canRemoveAnotherItem():Boolean
    fun removeItem():T
    fun getAnother():Container<T>
    fun contents():List<T>*//*
    fun canAddAnotherItem():Boolean
    fun addItem(item: T)
    fun canRemoveAnotherItem():Boolean
    fun removeItem():T
    fun getAnother():Container<T>
    fun contents():List<T>
}*/

fun main() {
     val result = EvenList<String>(listOf("This ", "Check"))
     TestingParameter<String, Int>("", 1)
    var arrayUtil = ArrayUtil<Int>(arrayOf(1, 2, 3, 4, 5, 6))
    val arrayUtil1 = ArrayUtil<String>(arrayOf("Checking", "Strings", "Array"))
    arrayUtil.findElement(3) { index, element ->
        println("Index $index")
        println("Element $element")
    }
}