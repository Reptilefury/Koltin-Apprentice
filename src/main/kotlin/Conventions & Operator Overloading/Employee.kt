package `Conventions & Operator Overloading`

/*class Employee(val company: Company, val name: String, var salary: Int) {

*//*    operator fun inc(): Employee {
        salary += 5000
        println("$name got a raise to $$salary")
        return this
    }
    operator fun dec():Employee {
        salary -= 5000
        println("$name was deducted $$salary from his salary due to indiscipline")
        return this

    }*//*

    operator fun plusAssign(increaseSalary:Int){
        salary += increaseSalary
        println("$name got a raise to $$salary")
    }
    operator fun minusAssign(decreasedSalary:Int){
        salary += decreasedSalary
        println("$name salary was decreased to $$salary")
    }
    data class Employee(val company: Company, val name:String, var salary:Int):Comparable<Employee>{
        override operator fun compareTo(other: Employee):Int {
            return when(other){
                this -> 0
                else -> name.compareTo(other.name)
            }
        }
    }

}*/
data class Employee(val company: Company, val name: String, var salary: Int) : Comparable<Employee> {

    operator fun plusAssign(increaseSalary: Int) {
        salary += increaseSalary
        println("$name got a raise to $$salary")
    }

    operator fun minusAssign(decreaseSalary: Int) {
        salary -= decreaseSalary
        println("$name's salary decreased to $$salary")
    }

    operator fun plus(employee: Employee): List<Employee> {
        return listOf(this, employee)
    }

    operator fun dec(): Employee {
        salary -= 5000
        println("$name's salary decreased to $$salary")
        return this
    }

    operator fun inc(): Employee {
        salary += 5000
        println("$name got a raise to $$salary")
        return this
    }

    operator fun rangeTo(other: Employee): List<Employee> {
        val currentIndex = company.allEmployees.indexOf(this)
        val otherIndex = company.allEmployees.indexOf(other)

        if (currentIndex >= otherIndex) {
            return emptyList()
        }

        return company.allEmployees.slice(currentIndex..otherIndex)
    }

    override operator fun compareTo(other: Employee): Int {
        return when (other) {
            this -> 0
            else -> name.compareTo(other.name)
        }
    }

}