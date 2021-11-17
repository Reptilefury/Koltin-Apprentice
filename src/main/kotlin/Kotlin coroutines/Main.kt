package `Kotlin coroutines`

fun main(){
    BuildingYard.startProject("SmartHouse", 20)
    async {
        (0..10).forEach{
            println("Message #$it from the ${Thread.currentThread().name} ")
        }


    }
    (0..10).forEach{
        println("Message #$it from the${Thread.currentThread().name}")
    }

}
public actual fun launch(
    context: CoroutineContext =  DefaultDispatcher,
    start:CoroutineStart = CoroutineStart.DEFAULT,
    parent:Job?= null,
    block: suspend CoroutineScope.() -> Unit
):Job
