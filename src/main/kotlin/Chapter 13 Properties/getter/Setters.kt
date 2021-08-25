package `Chapter 13 Properties`.getter


fun main(){
    class Guy(){
        var age: Int = 0
            get(){
                println("Just accesed age")
                return field
            }
        set(value){
            field = when{
             value < 18 -> 18
                value in 18..30 -> value
                else -> value -3
            }
//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
        }
        var  name: String  = "Justin"
        get(){
            println("received Name")
         return  field
        }
        set(value){
            field = value
        }
    }
    var guy = Guy()
    guy.name = "Justin"
    guy.age = 25
    println(guy)

}
