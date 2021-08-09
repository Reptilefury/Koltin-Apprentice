fun main(args: Array<String>) {
    var multiplyLambda: (Int, Int) -> Int
    multiplyLambda = { a: Int, b: Int ->
        Int
        a * b
    }
    val lambdaResult = multiplyLambda(4, 2)

    //using lambdas as arguments
    fun operateOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        val result = operation(a, b)
        println(result)
        return result
        val addLambda = { a: Int, b: Int ->
            a + b
        }
        operateOnNumbers(4, 2, addLambda)
    }

    //there is no need to define a lambda you can declare it this way

operateOnNumbers(4,2, operation = Int::plus)
    operateOnNumbers(4,2) {a,b ->

        a + b
    }
    var unitLambda:() -> Unit ={
        println("Kotline Apprentice is awesome!")
    }
    unitLambda()
    var counter = 0
    val incrementCounter = {
        counter += 1
        //this lambda is able to capture var counter because its within its scope


    }
    incrementCounter()
    println(incrementCounter())
    println(incrementCounter())
    println(incrementCounter())
    println(incrementCounter())
    println(incrementCounter())
    fun countingLambdas(): ()-> Int {
    var counter = 0
    var incrementCounter: () -> Int ={
        counter += 1
        counter
    }
        return incrementCounter
        println(incrementCounter())
    }
    val counter1 = countingLambdas()
    val counter2 = countingLambdas()
    println(counter1())
    println(counter2())
    println(counter1())
    println(counter1())
    println(counter1())
    println(counter2())
    val names = arrayOf("ZZZZZZZ", "BBBB", "A", "CCCC", "EEEEE")
    names.sorted() // this will return A, BBB, EEEE, ZZZZZ
    val namesByLength = names.sortedWith(compareBy{
        -it.length
    })
    println(namesByLength)
    val values = listOf(1,2,3,4,5,6)
    values.forEach {
        println("$it: ${it * it}")

    }
    var prices = listOf(1.5, 10.0, 4.99,2.30,8.19)
    val largePrices = prices.filter{
        it > 5.0
        // public inline fun <T> Iterable<T>.filter(predicate: (T) -> Boolean): List<T>
    }
    val salesPrices = prices.map{
        it * 0.9
    }
    println(salesPrices)
    //map function can also be used to change the type
    val userInput = listOf("0", "11", "haha", "42")
    val numbers = userInput.map{
        it.toIntOrNull()
    }
    println(numbers)
    val numbers2 = userInput.mapNotNull{
        it.toIntOrNull()
    }
    println(numbers2)
    var sum = prices.fold(0.0){
            a,b ->
        a + b
    }
    println(sum)
    sum = prices.reduce{
            a,b -> a+b

    }
    val stock = mapOf(1.5 to 5, 10.0 to 2, 4.99 to 20 , 2.30 to 5, 8.19 to 30)
    var stockSum = 0.0
    stock.forEach {
        stockSum += it.key * it.value
    }
    println(stockSum)
    //exercise
    val nameList = listOf("Jenna", "Lena", "Anna", "Maddison")
    val concatenate = nameList.reduce{
        a,b ->
        a+b
    }

    println(concatenate)
  //  l nameList = listOf("Jenna", "Lena", "Anna", "Maddison")
    nameList.forEach {
        println("$it: ${it + it}")
    }
    val  con =  nameList.fold("") {a,b -> a +b}
    val longNames =  nameList.filter { it.length > 4}.fold("") {
            a,b ->
        a+b
    }
    val folded =longNames.fold("") {a,b -> a+b}
    println("$con , $longNames,  $folded")
    val namesAndAges = mapOf("Jenna" to 20, "Chloe" to 22 , "Lena" to 18, "Anna" to 17, "Niamh" to 15)
    val underAge = namesAndAges.filter{
        it.value < 18
    }
    println(underAge)

}
