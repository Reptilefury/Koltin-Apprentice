package `Chapter 18  Generics`

class Sloth(val name: String, val isTwoFingered: Boolean) {
    fun eat() {}
    fun sleep() {}
}

data class Panda(val name: String) {
    fun eat() {}
    fun Sleep() {}
}

fun FeedCrew(crew: List<Sloth>) {
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

fun main() {
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