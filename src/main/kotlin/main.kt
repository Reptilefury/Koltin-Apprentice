/*fun main(args:Array<String>){

val names: Array<String> = arrayOf("Jenna", "Jenny", "James", "Lenna")
    println(names[0])
}*/

fun main(args: Array<String>){
    /*val innerPlannets = listOf("Mercury", "venus", "Mars", "Sartun", "Jupiter")
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
    fun IsEleminated(player: String): Boolean{
        return player !in players
    }
    println(IsEleminated("Bob"))
    players.slice(0..2).contains("Alice")
    //modifying Lists
    players.add("Charlie Day")
    players += "Gina"
    players += "Jenna"
    println(players.joinToString())
    var array = arrayOf(1,2,3)
    array += 4
println(array.joinToString())
    players.add(5,"Frank")
    println(array.joinToString())
    val wasPlayerRemoved = players.remove("Gina")
    println("It is $wasPlayerRemoved that Gina was removed.")
    val removedPlayer = players.removeAt(2)
    println("$removedPlayer was removed")
    println(players.joinToString())
    players[3] = "Franklin"
    println(players.joinToString())
    players[4] = "Jenna"
    players[2] ="Anna"
    players.sort()
    println(players.joinToString())
    players.set(3, "Anna")
    val arrayOfInts = arrayOf(1,2,3)
    arrayOfInts[0] = 4
    println(arrayOfInts.joinToString())
    val scores = listOf(2,2,8,6,1)
    for(player in players){
        println(player)

    }
    for((index, player)in players.withIndex()){
        println("${index + 1}.$player")
    }
    fun sumOfElements(list: List<Int>):Int{
        var sum = 0
        for(number in list){
            sum += number
        }
        return sum
    }
    println(sumOfElements(scores))
    for((scores, player) in players.withIndex()){
        println("${scores + 1 }.$player")
    }*/

var nullableList: List<Int>? = listOf(1,2,3,4)
    nullableList = null
    val array4 = arrayOf(1,2,3)
    println(array4[0])
    array4[0] = 4
    println(array4[0])
    for((index, array4)in array4.withIndex()){
        println("${index + 1}.$array4")
    }
    val array5 = arrayOf(1,2,3)
    array5[0] = array5[1]
    for(item in array5){println(item)}
    fun removeOne(item: Int, list: List<Int>):List<Int>{
        var removeItem = removeAt()

    }

}