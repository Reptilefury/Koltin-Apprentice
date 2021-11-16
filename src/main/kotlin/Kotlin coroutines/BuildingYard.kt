package `Kotlin coroutines`

object BuildingYard {

    fun startProject(name: String, floors:Int){
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
    }
}