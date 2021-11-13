package `Conventions & Operator Overloading`

class Company(val name: String) {
    val departments: ArrayList<Department> = arrayListOf()


    operator fun plusAssign(department: Department) {
        departments.add(department)
    }

    operator fun minusAssign(department: Department) {
        departments.remove(department)
    }
/*    val allEmployees:List<Employee>
     get() = arrayListOf<Employee>().apply{
         departments.forEach {
             addAll(it.employees)
         } sort()
     }
    operator fun rangeTo(other: Employee):List<Employee>{
        val currentIndex = company.allEmployees.indexOf(this)
        val otherIndex = company.allEmployees.indexOf(other)
        if(currentIndex >= otherIndex){
            return emptyList()
        }
        return company.allEmployees.slice(currentIndex..otherIndex)
    }
    print((Alice..Mark).joinToString{ it.name})*/
}
