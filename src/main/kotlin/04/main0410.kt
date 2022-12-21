import java.lang.IllegalArgumentException
import java.util.Date

class Person14(val firstName: String, val familyName: String) {
    var age: Int? = null
        set(value) {
            if (value != null && value <= 0) {
                throw IllegalArgumentException("Invalid age: $value")
            }
            field = value
        }
}

class Person15(var firstName: String, var familyName: String) {
    var fullName: String
        get(): String = "$firstName $familyName"
        set(value) {
            val names = value.split(" ")
            if(names.size != 2) {
                throw IllegalArgumentException("Ivalid full name: '$value'")
            }
            firstName = names[0]
            familyName = names[1]
        }
}

fun main() {
    val person = Person14("Choi" , "Seongmin")
    person.age = 20
    println(person.age)
    val person2 = Person14("ccc" , "sss")
    person2.age = 30
    println(person.age)
    println(person2.age)
    println(person.age)
}