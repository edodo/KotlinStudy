class Person51(var firstName: String, var familyName: String)

fun main(argv: Array<String>) {
    val person = Person51("John", "doe")
    val readName = person::firstName.getter
    val writeFamily = person::familyName.setter

    println(readName())
    writeFamily("Smith")
    println( person.familyName )
}