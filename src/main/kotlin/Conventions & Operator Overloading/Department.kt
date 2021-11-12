package `Conventions & Operator Overloading`

class Department(val name: String) {
    val employees: ArrayList<Employee> = arrayListOf()

    operator fun plusAssign(employee: Employee) {
        employees.add(employee)
        println("${employee.name} was hired to the $name deparment")
    }

    operator fun minusAssign(employee: Employee) {
        employees.remove(employee)
        println("${employee.name} was fired from $name department")

    }

   /* operator fun get(index: Int): Employee? {
        return if (index < employees.size) {
            employees[index]
        } else {
            null
        }
    }*/
    operator fun get(index: Int):Employee?{
        return if(index < employees.size){
            employees[index]
        } else {
            null
        }
    }
    operator fun set(index: Int, employee: Employee){
        if(index < employees.size){
            employees[index] = employee
        }
    }
    operator fun contains(employee: Employee) = employees.contains(employee)


}
