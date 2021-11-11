package `Conventions & Operator Overloading`



fun main(){
    val company = Company("Reptilefury Empire!!")
    val militaryCommunicationDepartment:Department = Department("Military!!")
    val ForeignAffairsDepartment:Department = Department("Foreign Affairs")
    val HumanResourceDepartment:Department = Department("This is HR MF!!!")


    //Board of Governors
    val MikeTyson = Employee(Company("Versace x RollsRoyce"),"Mike Tyson", 300000)
    val CusDAmato = Employee(Company("PeekA Boo"), "Cus D Amato", 500000 )
    val BruceLee = Employee(Company("All Mighty Productions!") , "Bruce Lee", 300000)

    val AnorldSwanneager = Employee(Company("Terminator"), "Anorld Swass", 200000)
    val DorianYates = Employee(Company("Dorian"), "Dorian", 250000)
    val RonnieColeman = Employee(Company("Light Weight Baby!!") , "Ronnie mfn Colemann", 300000)

    val AlbertEinstein = Employee(Company("Relativity"), "Albert Einstein", 400000)
    val LeornadoDaVinci = Employee(Company("DaVinci Code"), "Leornado DaVinci", 300000)
    val NikolaTesla = Employee(Company("Tesla!!"), "Nikola Tesla", 300000)



   var  Mike = MikeTyson.inc()
    val Ronnie = RonnieColeman.dec()
   Mike.plusAssign(5000)
   MikeTyson += 50000
   //Ronnie.plusAssign(5000)
    Ronnie.minusAssign(3000)
    RonnieColeman -= 50000

      println(Mike)
      println(Ronnie)
    company += militaryCommunicationDepartment
    company += ForeignAffairsDepartment
    company += HumanResourceDepartment
    militaryCommunicationDepartment += MikeTyson
    ForeignAffairsDepartment += AnorldSwanneager
    HumanResourceDepartment += RonnieColeman

    militaryCommunicationDepartment += NikolaTesla
    militaryCommunicationDepartment += LeornadoDaVinci
    militaryCommunicationDepartment += AlbertEinstein
    ForeignAffairsDepartment += DorianYates
    ForeignAffairsDepartment += RonnieColeman
 }
//I WILL START ON HANDLING COLLECTIONS TOMORROW MORNING
