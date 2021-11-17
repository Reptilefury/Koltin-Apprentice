package `Kotlin coroutines`

class  Building(val name:String){

    suspend fun makeFoundation() = launch {
        delay(300)
        //Thread.sleep(300)
        speakThroughBullHorn("[${Thread.currentThread().name}] The foundation is ready, get ready to rumble!!")
    }

    suspend fun buildFloor(floor: Int) = launch {
        delay(100)
        //Thread.sleep(100)
        //speakThroughBullHorn("$floor'th floor is raised")
        speakThroughBullHorn("[${Thread.currentThread().name}] FLoor number  $floor is built")
        ++floors
    }

    suspend fun placeWindows(floor: Int) = launch {
        delay(100)
        //Thread.sleep(100)
        speakThroughBullHorn("[${Thread.currentThread().name}] Windows are places on the floor number $floor")
    }

    suspend fun installDoors(floor: Int) = launch {
        delay(100)
        //Thread.sleep(100)
        speakThroughBullHorn("[${Thread.currentThread().name}] Doors are installed on the floor number $floor")
    }

    suspend fun provideElectricity(floor: Int) = launch {
        delay(100)
        //Thread.sleep(100)
        speakThroughBullHorn("[${Thread.currentThread().name}] Electricity is provided on the floor number $floor")
    }

    suspend fun buildRoof(floor: Int) = launch {
        delay(200)
        // Thread.sleep(200)
        speakThroughBullHorn("[${Thread.currentThread().name}] The roof is ready")
//speakThroughBullHorn("The roof is ready ")
    }

  suspend fun fitOut(floo Int) = launch {
        delay(200)
        //Thread.sleep(200)
    speakThroughBullHorn("[$Thread.currentThread().name]Floor number is $floor is furnished")
    // speakThroughBullHorn("The $floor'th is furnished")
    }

    fun speakThroughBullHorn(message: String) = println(message)


}