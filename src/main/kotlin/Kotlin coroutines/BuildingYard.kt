package `Kotlin coroutines`

object BuildingYard {

    /*fun startProject(name: String, floors:Int){
        val startTime = System.currentTimeMillis()
        val building = Building(name)

        building.speakThroughBullHorn("$name is started")
        building.makeFoundation(){
            (1 until floors).forEach{
                building.buildFloor(it)
                building.placeWindows(it)
                building.installDoors(it)
                building.provideElectricity(it)
                building.fitOut(it)
            }
             building.buildRoof(2)

            building.speakThroughBullHorn("${building.name} is already in  ${System.currentTimeMillis() - startTime}")
        }
    }*/
    suspend fun startProject(name:String, floors:Int){
        val building= async{
            val building = Building(name)
            val cores = Runtime.getRuntime().availableProcessors()
            building.SpeakThroughBullHorn(
                "The building of $name is started with $cores  building machines engaged"

            )
           building.makeFoundation().join()
            (1..floors).forEach{
                building.buildingFloor(it).join()
                building.placeWindows(it)
                building.installDoors(it)
                building.provideElectricity(it)
                building.fitOut(it)
            }
            building.buildRoof.join()
            building
        }.await()

        if(building.floors  == floors){
            building.SpeakThroughBullHorn("${building.name} is ready")
        }
    }
}