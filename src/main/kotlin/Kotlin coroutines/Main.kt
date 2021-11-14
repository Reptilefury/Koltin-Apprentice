package `Kotlin coroutines`

import kotlin.concurrent.thread


fun main(){
 /*  thread(start = true, name = "another thread"){
       (0..10).forEach{
           println("Message #$it from the ${Thread.currentThread().name}")
       }
   }
    (0..10).forEach{
        println("Message #$it from the ${Thread.currentThread().name}")

    }*/
   BuildingYard.startProject("Smart house", 20)
  /*  GlobalScope.launch{
        task2()
    }
    task1()
    Thread.sleep(2000L)*/
}

fun task1(){
    println("Hello")
}
/*suspend fun task2(){
    withContext(Dispatchers.IO){
        delay(1000L)
        println("World")
        print(Thread.currentThread().name)
    }
}*/
