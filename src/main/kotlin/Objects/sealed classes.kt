package Objects

sealed class Shape{

    class Circle(val radius:Int):Shape()
    class Square(val sideLength:Int):Shape()

    val Circle1 = Circle(5)
    val Circle2 = Circle(4)
    val Square1 = Square(6)
    val Square2 = Square(4)

    fun Size(shape:Shape):Int {
        return when(shape){
            is Shape.Circle -> shape.radius
            is Shape.Square -> shape.sideLength

        }

    }

}