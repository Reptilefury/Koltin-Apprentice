fun main(args: Array<String>){
 var multiplyLambda: (Int, Int) -> Int
 multiplyLambda = {
     a: Int,b: Int -> Int
     a * b
 }
    val lambdaResult = multiplyLambda(4,2)

    //using lambdas as arguments
    fun operateOnNumbers(a:Int, b:Int, operation: (Int,Int) -> Int):Int{
        val result = operation(a,b)
        println(result)
        return result
      val addLambda = {a: Int, b: Int ->
          a + b
      }
        operateOnNumbers(4, 2, addLambda)
    }

}
