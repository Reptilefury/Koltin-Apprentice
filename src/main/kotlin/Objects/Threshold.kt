package Objects

object Threshold {

    const val threshold: Int = 10
    fun isAboveThreshold(value: Int) = value > threshold


}
data class Students private constructor(val firstName: String, val lastName: String){
    companion object{
        fun loadStudents(studentMap:Map<String, String>): Students{
            val firstName = studentMap["first_name"]?: "First"
            val lastName = studentMap["last_name"]?: "Last"
            return  Students(firstName, lastName)
        }
    }
}