package `Kotlin Standard Library`


class Car{
    var model: String? = "Suv"
    var maxSpeed: String = "180KpH"
    val doors:Int = 10
}


fun main(){
    fun printCar(car: Car?){
        val isCoupe = car.let{
            (it?.doors!! <= 2)
        }
        if(isCoupe == true){
            println("Coupes are really awsome!!")
        }else{
            println("something went wrong please try again!! ")

        }
    }

}