package `Chapter 13 Properties`

class Contact(var fullName: String,val emailAddress: String){
    val contact = Contact(fullName = "Grace", emailAddress = "grace@gmail.com")
    var name = contact.fullName
    val email  = contact.emailAddress
//    contact.fullName = "Jenna"

    fun main(){
        println(name)
        println(email)
    }
    var Grace = contact.fullName

}
class Contact2(val fullName:String, emailAddress:String) {
    var contact2 = Contact2(fullName = "Grace", emailAddress = "grace@gmail.com")
    //contact2.fullName = Grace
}
class Contact3(val fullName: String, emailAddress: String, var type: String = "Friend"){



}