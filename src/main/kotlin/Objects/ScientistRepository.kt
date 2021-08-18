package Objects

import `Chapter 11 classes`.Scientist

object ScientistRepository {
    val allScients  = mutableListOf<Scientist>()
    fun addScientist(student:Scientist){
        allScients.add(student)
    }
    fun removeScientist(student: Scientist){
        allScients.remove(student)
    }
    fun listScientist(student:Scientist){
        allScients.forEach{
            println("${it.id}: ${it.fullName}")
        }
    }
}