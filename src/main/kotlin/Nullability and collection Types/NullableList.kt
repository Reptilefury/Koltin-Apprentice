package `Nullability and collection Types`

fun main(args: Array<String>){
    var nullableList: List<Int>? = listOf(2,3,4,6)
    nullableList = null
    //you can create a list with elements by shifting nullability to the type argument this is:
    var listOfNullable: List<Int?> = listOf(1,2,null,4)
    // you can set the whole list to be nullable inlcuding an individual element
    var newListOfNullable: List<Int?>? = listOf(2,4,null,6,8)
    newListOfNullable = null
    val array2  = arrayOf(2,4)
    val array3: Array<String> = arrayOf() 
    val array4 = arrayOf(1,2,3)
    println(array4[0])
    array4[0] = 4
    for((index, array4)in array4.withIndex()){
        println("${index + 1}.$array4")
    }
    val array5 = arrayOf(1,2,3)
    array5[0] = array5[1]
    for(item in array5){println(item)}




}