package `Maps and Sets`

fun main(args:Array<String>){
    var yearOfBirth = mapOf("Anna" to 1990 , "Craig" to 1992, "Donna" to 1994, "Brian" to 1995)
    // mapping player names to scores using mutable maps
    var namesAndScores = mutableMapOf("Anna" to 10 , "Lena" to 20, "Jenna" to 5, "Maddy" to 6)
    println(namesAndScores)
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
    for((player,score)in namesAndScores) {
        println("$player - $score")
    }
    for (player in namesAndScores.keys){
        print("$player")
        println()
    }
}