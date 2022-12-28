fun check22(s: String, condition: (Char) -> Boolean): Boolean {
    for(c in s) {
        if (!condition(c)) return false
    }
    return true
}
fun isCapitalLetter(c: Char) = c.isUpperCase() && c.isLetter()
fun main(argv: Array<String>) {
    println(check22("Hello") { c-> isCapitalLetter(c)})
    println(check22("Hello") { isCapitalLetter(it)})
    println(check("Hello", ::isCapitalLetter))

}