package `Chapter 8 Arrays and Lists`

fun main(args: Array<String>){
    val innerPlannets = listOf("Mercury", "venus", "Mars", "Sartun", "Jupiter")
    //Kotlin has inferred the type of this list to be a string
    val subscribers: List<String> = listOf()
    //the type argument can also be inferred on the function this way: listOf<String> but these lists aren't mutable
    //a mutable list can be created with the following function
    val outerPLanets = mutableListOf("Jupiter", "Saturn", "Uranus", "Neptune")
    //an empty mutable list
    val exoplanets = mutableListOf<String>()
    val players = mutableListOf("Alice", "Bob", "Dan")
    print(players.isEmpty())
    if (players.size<2){
        println("We need at least two players!")

    }else{
        println("Time to play the game")}
    fun IsEleminated(player: String): Boolean{
        return player !in players
    }
    println(IsEleminated("Bob"))
    //modifying Lists
    players.add("Charlie Day")
    //removing elements from the lists
    val wasPlayerRemoved = players.remove("Gina")
    println("It is $wasPlayerRemoved that Gina was removed ")




}