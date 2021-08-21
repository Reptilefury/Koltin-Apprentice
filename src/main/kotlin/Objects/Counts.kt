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
interface Discounts{
    fun Discountable(): Int?
    fun  tenPercentoff(): Int?
}
class Toy: Discounts{
    override fun Discountable(): Int?{
        return null
    }

    override fun tenPercentoff(): Int? {
        return null
    }
}
interface FS{
    fun readDir(): List<String>
    fun readFile(): String
}
interface newFileSystem{
    fun writeDir(): List<String>
    fun writeFile(): String
}
class Fat32:FS{
    override fun readDir(): List<String> {
        return emptyList()
    }

    override fun readFile(): String {
        return ""
    }
}
class NTFS: FS{
    override fun readDir(): List<String> {
        TODO("Not yet implemented")
    }

    override fun readFile(): String {
        TODO("Not yet implemented")
    }

}
class memoryFileSystem(val files: List<String>, val fileContents: String): FS,newFileSystem{
    override fun readDir(): List<String> {
     return files
    }

    override fun readFile(): String {
        return fileContents
    }

    override fun writeDir(): List<String> {
        return emptyList()
    }

    override fun writeFile(): String {
        return ""
    }

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
