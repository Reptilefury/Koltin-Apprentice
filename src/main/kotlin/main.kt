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
    var yearOfBirth = mapOf("Anna" to 1990 , "Craig" to 1992, "Donna" to 1994, "Brian" to 1995)
    // mapping player names to scores using mutable maps
    var namesAndScores = mutableMapOf("Anna" to 10 , "Lena" to 20, "Jenna" to 5, "Maddy" to 6)
    println(namesAndScores.get("Anna"))
   var check =  namesAndScores.isEmpty()
   var size = namesAndScores.size
   println(check)
    println(size)
    val bobData = mutableMapOf(
        "Name" to "Bob" , "Profession" to "CardPlayer",
        "Country" to "USA"
    )
    bobData.put("State","Texas")
    bobData["City"] = "San Francisco"
    bobData.put("Name", "Bobby")
    bobData["Profession"] = "Mailman"
    val pair = "nickname" to "Bobby D"
    bobData += pair
    println(bobData)
    //removing elements
    bobData.remove("City")
    bobData.remove("State", "Texas")
    for((player,score)in namesAndScores) {
        println("$player - $score")
    }
    for (player in namesAndScores.keys){
        print("$player")
        println()
    }
    println("some string".hashCode())
    println(1.hashCode())
    println(false.hashCode())
        val name = setOf("Anna", "Brian", "Craig", "David", "Anna")
        println(name)
    val someArray = arrayOf(1,2,3,4,1)
    var someSet = mutableSetOf(*someArray)
    println(someSet)
  println(someSet.contains(1))
    println(4 in someSet)
    println(someSet.first())
    println(someSet.last())
    var add = someSet.add(5)
    val removed = someSet.remove(1)
    add = someSet.add(6)

    println(someSet)
    println(removed)
    var newArray = arrayOf(4,5,6,7,8)
    var set = mutableSetOf(*newArray)
    var addElementToArray  = set.add(9)
    val removeElement = set.remove(4)
    println(addElementToArray)
    println(set)
    //maps challange
    var emptyMap = emptyMap<Int, Int>()
    emptyMap += 4 to 6
    println(emptyMap)
    val map4 = mutableMapOf("One" to 1, "Two" to 2, "Three" to 3)
    map4[1]
    map4["One"]
    map4["Zero"] = 0
    println(map4)
   val map5 =  mutableMapOf("NY" to "New York" , "CA" to "California")
    map5["NY"]
    map5["WA"] = "Washington"
   // map5["CA"] = null
    for((states, city) in map5){
        println("$states $city")
    }
    fun mergeMaps(map1: Map<String, String>, map2: Map<String, String>): Map<String,String>{
     val mergedMap: MutableMap<String, String> = mutableMapOf()
         mergedMap.putAll(map1)
         mergedMap.putAll(map2)
         return mergedMap

     }
    val firstMap = mapOf("2"  to "4", "2" to "2")
    val secondMap = mapOf("6" to "8", "3" to "3")
    mergeMaps(firstMap, secondMap)
    println("${mergeMaps(firstMap, secondMap)}")
    //mergeMaps(mapOf("Belgium" to "Brussels"), mapOf("England" to "London"))
    /*fun mergeMaps(map1: Map<String, String>, map2: Map<String, String>): Map<String, String> {
        val map3: MutableMap<String, String> = mutableMapOf()
        map3.putAll(map1)
        map3.putAll(map2)
        return map3
    }

    val firstMap = mapOf("1" to "2", "2" to "2")
    val secondMap = mapOf("1" to "1", "3" to "3")
    println(mergeMaps(firstMap, secondMap))*/

}