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

class Person22(val firstName: String, val familyName: String) {
    fun hasNameOf(name: String) = name.equals(firstName, ignoreCase = true)
}

fun max12(a: Int, b: Int) = if( a > b ) a else b
fun max12(a: Double, b: Double) = if (a > b) a else b

fun main(argv: Array<String>) {
    println(check22("Hello") { c-> isCapitalLetter(c)})
    println(check22("Hello") { isCapitalLetter(it)})
    println(check("Hello", ::isCapitalLetter))
    fun dec(n: Int) = n -1
    println(evalAtZero(::inc))
    println(evalAtZero(::dec))

    val createPerson= ::Person22
    createPerson("John", "Doe")

    val isJohn = Person22("Choi", "Seongmin")::hasNameOf
    println(isJohn("choi"))
    println(isJohn("Choi"))
    val f: (Int, Int) -> Int = ::max
    println(f(1,2))
}