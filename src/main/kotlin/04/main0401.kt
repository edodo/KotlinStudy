import java.lang.IllegalArgumentException

class Person(firstName: String, familyName: String = "") {
    var firstName: String = firstName
    var familyName: String = familyName
    var age: Int = 0

    val fullName = "$firstName $familyName"
    fun fullName2() = "$firstName - $familyName"
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

class Room(vararg val persons: Person) {
    fun showNames(){
        for (person in persons) println(person.fullName2())
    }
}

class Person2 {
    val firstName: String
    val familyName: String
    constructor(firstName: String, familyName: String) {
        this.firstName = firstName
        this.familyName = familyName
    }

    constructor(fullName: String) {
        val names = fullName.split(" ")
        if (names.size != 2) {
            throw IllegalArgumentException("Invalid name: $fullName")
        }

        firstName = names[0]
        familyName = names[1]
    }
}
class Person3 {
    val fullName: String
    constructor(firstName: String, familyName: String) : this("$firstName $familyName")

    constructor(fullName: String) {
        this.fullName = fullName
    }
}
class Person4(val fullName: String) {
    constructor(firstName: String, familyName: String) : this("$firstName $familyName")

}
fun main() {
    val person = Person("Choi", "Seongmin")
    println( person.fullName )
    println( person.fullName2() )

    val room = Room(Person("choi"), Person("csm", "0222"))
    room.showNames()
}