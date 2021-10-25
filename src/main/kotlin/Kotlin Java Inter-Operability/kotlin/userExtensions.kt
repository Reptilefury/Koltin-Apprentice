package `Kotlin Java Inter-Operability`.kotlin

import Kotlin.User

val User.fullName: String
    get() = firstName + "" + lastName

/*fun User.addressOfType(type: AddressType): Address? {
    return addresses.firstOrNull { it.addressType == type }
}*/
fun User.addOrUpdateAddress(address:Address){
    val existinOfType = addressOfType(address.addressType)
    if (existinOfType != null){
        addresses.remove(existinOfType)
    }
    addresses.add(address)
}