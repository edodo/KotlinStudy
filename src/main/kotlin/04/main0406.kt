fun sayHello(name: String?) {
    println("Hello, " + (name ?: "Unknown"))
}

class Name(val firstName: String, val familyName: String?)

class Person11(val name: Name?) {
    fun describe(): String {
        val currentName = name ?: return "unKnown"
        return "${currentName.firstName} ${currentName.familyName}"
    }
}

fun main(argv: Array<String>) {
    sayHello("Choi")
    sayHello(null)
    println(Person11(Name("Choi", "Seongmin")).describe())
    println(Person11(null).describe())

}