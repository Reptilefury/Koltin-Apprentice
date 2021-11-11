package `Conventions & Operator Overloading`

fun main(){
    Baking()
}
fun Baking(){
    println("BAKED MUFFINS!!")
        //val add = fluffy += snowflake
//println(fluffy + snowflake)
}

class Kitten( val message:String){
operator fun plusAssign(kitten: Kitten){

}

}
val fluffy:Kitten = Kitten("Fluffy")

val snowflake = Kitten("Snowflake")

fun takeHome(){

}




    //Kitten("Fluffy")