package `Chapter 11 classes`

fun main(args: Array<String>){
    class Person(var firstName: String, var lastName: String){
        val fullName
            get() = "$firstName $lastName"

    }

    class  PersonDetails(var height: Int, var  Age: Int, var Nationality: String){
        val details
        get() = "$height  and $Age  and $Nationality"

    }
    var john = PersonDetails(190,24, "Belgian")

    var John = Person(firstName ="John",lastName = "McC")
    var homeOwner = John
      John.firstName = "john"
    println(John.fullName)
    println(john.Age)
    println(john.Nationality)
    println(john.details)
    println(John.firstName)
    println(homeOwner.firstName)
}

