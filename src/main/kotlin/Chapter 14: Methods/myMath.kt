package `Chapter 14 Methods`
import `Chapter 14 Methods`.simpleDate3
class myMath {
    companion object{
        fun factorial(number: Int): Int{
            return (1..number).fold(1){a,b -> a*b}
        }
        fun triangle(number: Int): Int{
            return(1..number).fold(1) {a,b -> a + b}
        }
    }
}
fun main(){
    myMath.factorial(8)
    myMath.triangle(8)
    println("Please enter a number here:")
    val input = readLine()?.toInt()
    fun Int.isPrime():Boolean {
        for(i in 2 until this -1 ){
            if(this % 2 == 0){
                return false
            }
        }
        return true
    }
  if (input != null){
      if(input.isPrime()){
          println("$input is a prime number")
      }else{
          println("$input is not a prime number")
      }
  }
   /* println("Enter a number:")
    val input = readLine()?.toInt()
    fun Int.isPrime():Boolean {
        for(i in 2 until this -1){
            if(this %  2 == 0){
                return false
            }
        }
        return true
    }
    if (input != null){
        if(input.isPrime()){
            println("$input is a prime number")
        }else{
            println("$input is not a prime number")
        }
    }*/
/*    println("Please enter a number")
    val input = readLine()?.toInt()
    fun Int.isPrime(): Boolean{
      for (i in 2 until this - 1){
          if (this % 2 ==0 )
              return false
      }
    }
    if (input != null) {
       if(input.isPrime()){
           println("$input is a prime number")
       } else{
           println("$input is not a prime numver")
       }
    }*/
    //BEGIN ON EXTENSION FUNCTIONS IN KOTLIN



}
class newFactorial{
    companion object{

        fun factorial(number: Int): Int{
            return (1..number).fold(1) {a,b -> a*b}
        }
        fun triangle(number: Int):Int{
            return(1..number).fold(1){a,b -> a+b}
        }
    }
}

//fun SimpleDate.monthsUntilSummerBreak()
/*
fun Kata(word: String): String{
    val len = word.length
    if (len )
}*/
