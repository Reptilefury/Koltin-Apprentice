package `Chapter 15 Advanced Classes`

 class Team{
     var players = mutableListOf<StudentAthlete>()
     val isEligible: Boolean
     get(){
         for(player in players){
             if(!player.isEligible){
                 return false
             }
         }
         return true
     }
 }