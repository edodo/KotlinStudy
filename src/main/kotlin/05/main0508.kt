fun String.truncate(maxLength: Int): String {
    return if (length <= maxLength) this else substring(0, maxLength)
}
class Person58(val name: String, val age: Int)
fun Person58.hasName(name:String) = name.equals(this.name, ignoreCase = true)

fun main(args: Array<String>) {
    println("Hello".truncate(10))
    println("Hello".truncate(3))
    val f = Person58("John", 25)::hasName
    println(f("joHn"))
    println(f("Jake"))
}

