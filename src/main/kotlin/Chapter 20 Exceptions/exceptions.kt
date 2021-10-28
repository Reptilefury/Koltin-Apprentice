package `Chapter 20 Exceptions`
//someFunction //Another function //OneMoreFunction //
fun main(){
    return someFunction()
}
fun someFunction() {
    return AnotherFunction()
}
fun AnotherFunction(){
    return OneMoreFunction()
}
fun OneMoreFunction(){
    throw Exception("Some Exception")
}

//Will start on throwing exceptions