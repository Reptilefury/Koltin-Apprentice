package `Chapter 18  Generics`
open class Mammal(val name: String){

    fun eat(){}
    fun Sleep(){}
}
class Sloth(val SlothName:String, val isTwoFingered: Boolean):Mammal(SlothName)
data class Panda(val PandaName: String):Mammal(PandaName)
data class Kooala(val KooalaName:String):Mammal(KooalaName)
fun FeedCrew(crew: List<Mammal>) {
    crew.forEach {
        it.eat()
        println("${it.name} ate some red leaves")
    }
}
fun FeedPandaCrew(crew:List<Panda>){
      crew.forEach{
          it.eat()
          println("${it.name}  has ate some Kungfu Panda Noodles.")
      }
}
fun FeedKoolaCrew(crew:List<Kooala>){
    crew.forEach{
        it.eat()
        println("${it.name} has ate some Koola bamboo!!")
    }
}


fun main() {
    val kooala:Kooala?
    val koolaCrew = listOf<Kooala>(
        Kooala("Aurelie"),
        Kooala("Jenna"),
        Kooala("Anna"),
        Kooala("Lena"),
        Kooala("Chloe"),
        Kooala("Logan Roy"),
    )
    val koolaList:List<Kooala> = listOf()
    val koolaList2:List<Kooala> = listOf()

    val sloth: Sloth?
    val slothCrew = listOf<Sloth>(
        Sloth("Jerry", true),
        Sloth("Bae", true),
        Sloth("Karen", true),
        Sloth("Jenna", true),
        Sloth("Lena", true)
    )
    val panda: Panda?
    val PandaCrew = listOf<Panda>(
        Panda("Po"),
        Panda("Michael Angelo"),
        Panda("Mikey")
    )
    val PandaList: List<Panda> = listOf()
    val PandaList2: List<Panda> = listOf<Panda>()
    FeedCrew(slothCrew)
    val slothList: List<Sloth> = listOf()
    val slothList2: List<Sloth> = listOf<Sloth>()


}