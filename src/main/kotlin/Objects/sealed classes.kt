package Objects

sealed class Shape{
    class Circle(val radius: Int):Shape()
    class Square(val sideLength:Int):Shape()

    val circle1 = Circle(6)
    val circle2 = Circle(4)
    val Square1 = Square(5)
    val Square2 = Square(5)

    fun size(shape:Shape){
        when (shape){
            is Shape.Circle -> shape.radius
            is Shape.Square -> shape.sideLength
        }
    }
}
sealed class Shape1{
    object none: Shape1()
    data class Circle(val radius: Int):Shape1()
    data class Rectangle(val width: Int, val height:Int):Shape1()

}

sealed class Data{
    class Success(val success:String):Data()
    class Error(val error:String):Data()
    class Loading(val loading: String):Data()

}
fun  getData():Data{
    return Data.Success((100..1000).random().toString())
}
/*sealed class Data{
    class Error(val error:String):Data()
    class Success(val success: String): Data()
    class Loading(val loading:String): Data()
     //object Loading
   // class Loading(val loading: String):Data()

}*/
/*fun getData():Data{

    return Data.Success((100..1000).random().toString())
}*/
fun main(){
    val data = getData()
    when(data){
        is Data.Success -> {
            println(data)
        }
        is Data.Error -> {
            println(data)
        }
        is Data.Loading ->{
            println(data)
        }
    }

/*    val data = getData()
    when(data){
        is Data.Success -> {
            println(data)
        }
        is Data.Error -> {
            println(data)
        }
         is Data.Loading -> {
             println(data)
         }
    }*/
    fun AreaOf(shape: Shape1):Number = when (shape){
         is Shape1.none  -> 2
         is Shape1.Circle -> 4
         is Shape1.Rectangle -> 6
     }
}