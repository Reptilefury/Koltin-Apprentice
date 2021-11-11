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
}
