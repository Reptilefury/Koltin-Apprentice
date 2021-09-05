package `Chapter 14 Methods`

fun main(){
    class Student{
        fun hasPassed(marks:Int): Boolean{
            return marks>40
        }
    }
    fun Student.isScholar(marks:Int):Boolean{

        return marks > 90
    }
    fun Student.isAverage(marks:Int):Boolean{
        return marks>50
    }
    var student = Student()
    println("Scholar:${student.isScholar(65)}")
    println("Average:${student.isAverage(50)}")
    println("Pass status:${student.hasPassed(57)}")
    var str1:String = "Hello world"
    var str2: String = "Hey"
    var str3:String = "Oh"

fun  String.add(s1:String, s2:String, s3:String): String{
    return s1 + s2 + s3 + s3
}
    val ans = str3.add(str3,str1,str2,)
println(ans)
    var x:Int = 6
    var y:Int = 7
fun Int.greaterValue(other:Int):Int{
    return if(this > other){
        this
    }else
        other

    }
    var Ram: String = "12"
    var CPU:String = "i9"
    var  GPU: String = "3080Ti"
    var SPECS = "DELL="
    fun String.Specs(Ram:String, CPU:String, GPU:String):String{
        return Ram + CPU + GPU
    }
    var computer = SPECS.Specs("12GB  ","i7  ","RTX3080  ")
    println(computer)
}