package `Chapter 8 Arrays and Lists`

//arrays should contain only one type of value i.e don't mix strings and Integers.
fun main(args: Array<String>) {
    //use the function: arrayOf() to create an array.
    val evenNumbers = arrayOf(2, 4, 6, 8)
    //the array above Kotlin has inferred it to be of a type Int, this type is written as Array<Int>
    // you can also create an array with all of its values set to default like:
    val fiveFives = Array(5,{5}) //5,5,5,5,5,5
    //declare arrays that are not going to change as constants using the val keyword.
    val vowels  = arrayOf("a", "e", "i", "o", "u" )
    //below is an array of odd numbers, there are more kotlin functions for dealing with arrays.

    val oddNumbers = intArrayOf(1,3,5,7)
    // the other standard library functions include floatArrayOf(), doubleArrayOf() and booleanArrayOf()
    val zeros = DoubleArray(4) //the number indicates the size of the array
    //You can also convert between the boxed and primitive arrays using functions such as:
    val otherOddNumbers = arrayOf(1,3,5,7).toIntArray()

   val names: Array<String> = arrayOf("James", "John", "Jenny", "Jenna")
    println(names[0])
fun newArray(name1:String, name2:String, name3:String,name4: String){
    val names: Array<String> = arrayOf(name1, name2, name3, name4)
    println(names[0])

}
    newArray("James", "John", "Jenny", "Jenna")

}