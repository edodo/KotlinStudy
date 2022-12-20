class Person12(val firstName: String, val familyName: String) {
    val fullName: String
        get(): String {
            println("Access fullName")
            return "$firstName $familyName"
        }
    /*get(): String {
        return "$firstName $familyName"
    }*/
    // get() = "$firstName $familyName"

}
class Person13(val firstName: String, val familyName: String, age: Int) {
    val age: Int = age
        get(): Int {
            println("Access age")
            return field
        }
    /*get(): String {
        return "$firstName $familyName"
    }*/
    // get() = "$firstName $familyName"

}
fun main() {
    val person = Person12("Choi", "Seongmin")
    println(person.fullName)

    val person3 = Person13("Choi", "Seongmin", 12)
    println(person3.age)
}