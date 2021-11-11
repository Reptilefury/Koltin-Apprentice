package `Conventions & Operator Overloading`

class Company(val name: String) {
    val departments: ArrayList<Department> = arrayListOf()


    operator fun plusAssign(department: Department) {
        departments.add(department)
    }

    operator fun minusAssign(department: Department) {
        departments.remove(department)
    }
}
