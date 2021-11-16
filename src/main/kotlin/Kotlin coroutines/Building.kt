package `Kotlin coroutines`

class  Building(val name:String){

    fun makeFoundation(function: () -> Unit) {
        Thread.sleep(300)
        speakThroughBullHorn("Foundation is ready, get ready to rumble!!")
    }
    fun buildFloor(floor:Int){
        Thread.sleep(100)
        speakThroughBullHorn("$floor'th floor is raised")
    }
    fun placeWindows(floor:Int){
        Thread.sleep(100)
        speakThroughBullHorn("Windows are places on the $floor'th floor")
    }
    fun installDoors(floor:Int){
        Thread.sleep(100)
        speakThroughBullHorn("Doors are installed on the $floor'th floor ")
    }
    fun provideElectricity(floor:Int){
        Thread.sleep(100)
        speakThroughBullHorn("Electricity is provided on the $floor'th floor")
    }
    fun buildRoof(floor:Int){
        Thread.sleep(200)
        speakThroughBullHorn("The roof is ready ")
    }
    fun fitOut(floor:Int){
        Thread.sleep(200)
        speakThroughBullHorn("The $floor'th is furnished")
    }

    fun speakThroughBullHorn(message:String)= println(message)


}