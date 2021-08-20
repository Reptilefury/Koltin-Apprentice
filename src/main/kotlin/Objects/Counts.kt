package Objects

import `Chapter 11 classes`.Scientist


interface Counts{
    fun StudentCount(): Int
    fun ScientistCount(): Int
}
var Counter = object: Counts{
    override fun  StudentCount(): Int{
        return StudentRegistry.AllStudents.size
    }
    override fun ScientistCount(): Int{
        return ScientistRepository.allScients.size
    }
    
}
fun main(args: Array<String>){
    println(Counter.StudentCount())
    println(Counter.ScientistCount())
}

/*
interface Counts {
    fun StudentCount(): Int
    fun ScientistCount(): Int

}
var Counter = object : Counts{
    override fun StudentCount(): Int {
        return StudentRegistry.AllStudents.size
    }

    override fun ScientistCount(): Int {
        return ScientistRepository.allScients.size
    }

}
fun main(args: Array<String>){
    println(Counter.StudentCount())
    println(Counter.ScientistCount())
}*/
