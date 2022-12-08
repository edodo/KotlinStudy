fun isLetterString(s: String): Boolean {
    if (s.isEmpty()) return false
    for (ch in s) {
        if(!ch.isLetter() ) return false
    }
    return true
}

fun isBooleanString(s: String?) = s == "false" || s == "true"

fun exclaim(s: String?) {
    println(s + "!")
}

fun main(argv: Array<String>) {
    println(isLetterString("abc"))
    println(isBooleanString(null))
    val s: String? = "abc"
    // val ss: String =s

    val n: Int = 1
    val x: Int? = 1
    exclaim(null)
}