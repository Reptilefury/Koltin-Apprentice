package `Chapter 14 Methods`

import sun.jvm.hotspot.oops.CellTypeState.value
import java.lang.reflect.Array.set
import javax.swing.UIManager.get

fun main(){
    var numbers = arrayListOf(1, 2,3,4)
   // numbers.removeAt(3)
    numbers.removeAt(numbers.lastIndex)
    println(numbers)
 var months = arrayOf("January","Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December")
    class simplerDate1(var month: String)


    fun monthUntilWinterBreak(from: simplerDate1):Int{
        return months.indexOf("December") - months.indexOf(from.month)
    }
    val date3 = simpleDate3("November")
    date3.monthsUntilWinter()
    println(date3.monthsUntilWinter())
   // println(getter)

}

class simpleDate2(var month: String){
    var months = arrayOf("January","Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December")


    fun monthsUntilWinter(from: simpleDate2):Int {
        return months.indexOf("December") - month.indexOf(from.month)
    }
}
class simpleDate3(var month: String){
    var months = arrayOf("January","Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December")

    fun monthsUntilWinter(): Int {
        return months.indexOf("September") - month.indexOf(month)

    }
//    var date3 = simpleDate3("November")

}
class simpleDate4(var month: String){
    var months = arrayOf("January","Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December")

    fun monthsUntilWinter(): Int{
        return months.indexOf("September") - month.indexOf(month)
    }

    var getter = 0
        get() = monthsUntilWinter()
    set(value){
        field = value
    }
}
