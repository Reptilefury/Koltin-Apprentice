package `Chapter 14 Methods`


fun main(){
    val numbers = arrayListOf(1, 2,3,4)
   // numbers.removeAt(3)
    numbers.removeAt(numbers.lastIndex)
    println(numbers)
 val months = arrayOf("January","Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December")
    class simplerDate1(var month: String)


    fun monthUntilWinterBreak(from: simplerDate1):Int{
        return months.indexOf("December") - months.indexOf(from.month)
    }
    val date3 = simpleDate3("November")
    date3.monthsUntilWinter()
    println(date3.monthsUntilWinter())
    val date4 = simpleDate4("June")
   // date4.month
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
fun simpleDate4.monthsUntilSummerBreak(): Int {
    val monthIndex = months.indexOf(month)
    return if (monthIndex in 0..months.indexOf("June")) {
        months.indexOf("June") - months.indexOf(month)
    } else if (monthIndex in months.indexOf("June")..months.indexOf("August")) {
        0
    } else {
        months.indexOf("June") + (12 - months.indexOf(month))
    }
}
//fun simpleDate3.monthsUntilSummerBreak(): Int {
   //  val monthIndex= months.indexOf(month)
    //return if(monthIndex in 0..months.indexOf("June")months.indexOf("August")){
   //     0
    //}else {
     //   months.indexOf("June")+ (12 - months.indexOf(month))
   // }
//}