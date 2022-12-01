class Person(firstName: String, familyName: String) {
    var firstName: String = ""
    var familyName: String = ""
    var age: Int = 0

    val fullName = "$firstName $familyName"

    fun showMe() {
        println("${fullName}: $age")
    }

    fun setName(firstName: String, familyName: String) {
        this.firstName = firstName
        this.familyName = familyName
    }
    init {
        println("Created new Person...")
    }
}

fun showAge(p: Person) = println(p.age)

fun readAge(p: Person) {
    p.age = readLine()!!.toInt()
}
fun main() {
    val person = Person("Choi", "Seongmin")
    println( person.fullName )
}