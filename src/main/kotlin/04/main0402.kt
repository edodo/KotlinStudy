import java.lang.IllegalArgumentException

class Person5(val id: Id, val age: Int) {
    class Id(val firstName: String, val familyName: String)
    fun showMe() = println("${id.firstName} ${id.familyName}, $age")
}
fun main() {
    val id = Person5.Id("Choi", "Seongmin")
    val person = Person5(id, 42)
    person.showMe()
}