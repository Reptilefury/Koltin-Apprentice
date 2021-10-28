package `Kotlin Java Inter-Operability`.kotlin

enum class AddressType {
    Billing,
    Shipping,
    Gift
}
//streetline1 & 2 , city, state, postalCode, addressType, country

data class Address(
    val streetline1: String,
    val streetline2: String,
    val city: String,
    val state: String,
    val postalCode: String,
    val addressType: AddressType,
    val country: String = "Australia"

) {
    fun postalLabel(): String {
        var printedAddress = streetline1
        streetline2.let{ printedAddress = "\n$streetline2"}
        printedAddress += "\n$city, $state $postalCode"
        printedAddress += "\n${country.toUpperCase()}"
        return printedAddress
    }

/*    override fun toString():String{
      //  return forPostalabel()
    }*/
}
fun main(){

    val billingAddress = Address("123 Fake Street", "4th floor",
        "Los Angeles", "CA", "90201", AddressType.Billing)
    println("Billing Address: \n$billingAddress\n")


    //user.addOrUpdateAddress(billingAddress)
    //println("User info after adding address:\n$user")
    println("Shipping Label:")
    //printLabelFor(user, addressType.Shipping)
}
/*
fun forPostalabel():String{
//var printedAddress = streetline1
//streetLine2?.let {printedAddress += "\n$it"}
printedAddress += "\n$city, $state $postalCode"
printedAddress += "\n${country.toUpperCase()}"
return printedAddress
}
*/

