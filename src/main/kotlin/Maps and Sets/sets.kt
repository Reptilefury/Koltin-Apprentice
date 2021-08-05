package `Maps and Sets`
fun main(args: Array<String>){
    val name = setOf("Anna", "Brian", "Craig", "David", "Anna")
    println(name)

    // creating an empty set by calling a constructor
    val hashSet = HashSet<Int>()
    val someArray = arrayOf(1,2,3,1)
    var someSet = mutableSetOf(*someArray)
    println(someSet)
    println(someSet.contains(1))
    //checking for elements in Sets
    println(someSet.contains(2))
    println(4 in someSet)
    // returning first and last elements in a set
    println(someSet.first())
    println(someSet.last())
    //adding an element to a set
    val add = someSet.add(5)
    val removed = someSet.remove(1)
    println(someSet)
    var newArray = arrayOf(4,5,6,7,8)
    var set = mutableSetOf(*newArray)
    var addElementToArray  = set.add(10)
    println(addElementToArray)
    var map2 = emptyMap<Int, Int>()
     map2 += 4 to 6
 println(map2)
}