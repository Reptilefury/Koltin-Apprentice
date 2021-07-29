/*fun main(args:Array<String>){

val names: Array<String> = arrayOf("Jenna", "Jenny", "James", "Lenna")
    println(names[0])
}*/

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
    println(players.isEmpty())
    if (players.size<2){
        println("We need at least two players!")

    }else{
        println("Time to play the game")}
    var currentPlayer = players.first()
    println(currentPlayer)
    println(players.last())
    val minPlayer = players.min()
    minPlayer.let{
        println("$minPlayer  will start")
        val maxPlayer = players.max()
        if(maxPlayer != null){
            println("$maxPlayer is the MAX")
        }

    }
    println(arrayOf(2,4,6,8).first())
    println(arrayOf(2,4,6,8,1).min())
    //These methods are crucial when obtaining the first, last and max & minimum elements.
   val firstPlayer = players[0]
    println(firstPlayer)
    val secondPlayer = players.get(1)
    println(secondPlayer)
    // val playing = players.get(4) error because the array size is less than what the method is requesting for
    val upComingPlayerSlice = players.slice(1..2)
    println(upComingPlayerSlice.joinToString())
    //using the slice method with ranges is used to fetch more than a single value from an array or List.


}