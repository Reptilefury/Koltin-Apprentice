import Kotlin.User
import `Kotlin Java Inter-Operability`.kotlin.fullName

fun labelFor(user: User, type:AddressType):String{
 val address = user.addressOfType(Type)
  if(address != null){
      var label = "------\n"
      label += "${user.fullName}\n${address.forPostalabel()}\n"
      label += "----\n"
      return  label
  } else {
      return "\n!! ${user.fullName} does not have a $type address set up !!n"

  }
}
 fun printLabelForUser(user: User, type:AddressType){
     println(labelFor(user, type))
 }