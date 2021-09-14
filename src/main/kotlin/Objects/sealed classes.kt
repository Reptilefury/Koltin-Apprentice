package Objects

sealed class Shape{
    class Circle(val radius: Int) : Shape()
    class Square(val sideLength: Int) : Shape()

    val Circle1 = Circle(4)
    val Circle2 = Circle(6)
    val Square1 = Square(8)
    val Square2 = Square(6)

    fun Size(shape: Shape) {
        when (shape) {
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
fun main(){
     fun AreaOf(shape: Shape1):Number = when (shape){
         is Shape1.none  -> 2
         is Shape1.Circle -> 4
         is Shape1.Rectangle -> 6
     }
}