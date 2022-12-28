fun check22(s: String, condition: (Char) -> Boolean): Boolean {
    for(c in s) {
        if (!condition(c)) return false
    }
    return true
}
fun isCapitalLetter(c: Char) = c.isUpperCase() && c.isLetter()

fun evalAtZero(f: (Int) -> Int) = f(0)
fun inc(n: Int) = n +1
fun dec(n: Int) = n -1

class Person22(val firstName: String, val familyName: String)

fun main(argv: Array<String>) {
    println(check22("Hello") { c-> isCapitalLetter(c)})
    println(check22("Hello") { isCapitalLetter(it)})
    println(check("Hello", ::isCapitalLetter))
    fun dec(n: Int) = n -1
    println(evalAtZero(::inc))
    println(evalAtZero(::dec))

    val createPerson= ::Person
    createPerson("John", "Doe")
}