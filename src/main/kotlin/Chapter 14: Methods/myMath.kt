package `Chapter 14 Methods`

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
    println("Hello there")
    val input = readLine()!!.toInt()
    if (input != null) {
     //   input.isPrime()
    }
    //BEGIN ON EXTENSION FUNCTIONS IN KOTLIN
    fun Int.isPrime(): Boolean{
        //for(i in Int){
      //      if()
    //    }

    }


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
