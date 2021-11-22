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
private fun CookRice(){
    println("Starting to cook the rice on: ${getCurrentThreadName()}")
    Thread.sleep(1000)
    println("The rice has been cooked already!!")
}
private fun PrepareFish(){
    println("Start to prepare the Fish on: ${getCurrentThreadName()}")
    Thread.sleep(2000)
     println("The fish has been prepared!!")
}
private fun cutTheVegetables(){
    println("Start to cut the vegetables on: ${getCurrentThreadName()}")
   Thread.sleep(2000)
    println("The fish has already been prepared!!")
}
 private fun RollTheSUshi(){
     println("Starting to Roll the Sushi on: ${getCurrentThreadName}")
      Thread.sleep(2000)
      println("Completely rolled the sushi!")
 }
private fun PrintCurrentThreadName(){
  println("Running on ${getCurrentThreadName() }")

}
private fun getCurrentThreadName():String = Thread.currentThread().name
fun main(){
    PrintCurrentThreadName()
    var sushiCookingJob = Job
    val time = measureTimeMillis{
       sushiCookingJob = GlobalScope.launch(newSingleThreadContext("SushiThread"))

    }
}