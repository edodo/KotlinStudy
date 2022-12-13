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

fun isLetterString2(s: String?): Boolean {
    if (s == null) return false

    if (s.isEmpty()) return false

    for( ch in s ) {
        if (!ch.isLetter()) return false
    }

    return true
}

fun describeNumber(n: Int?) = when(n) {
    null -> "null"
    in 0..10 -> "small"
    in 11..100 -> "large"
    else -> "out of range"
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
