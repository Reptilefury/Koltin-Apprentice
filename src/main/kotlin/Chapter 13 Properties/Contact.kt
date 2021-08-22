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

