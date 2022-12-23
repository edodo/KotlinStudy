
fun sum3(numbers: IntArray) =
    aggregate(numbers, { result, op -> result + op})
fun max3(numbers: IntArray) =
    aggregate(numbers, { result, op -> if (op > result ) op else result })

fun check(s: String, condition: (Char) -> Boolean): Boolean{
    for (c in s ) {
        if (!condition(c)) return false
    }
    return true
}

fun check2(s: String, condition: (Int, Char) -> Boolean): Boolean {
    for (i in s.indices) {
        if (!condition(i, s[i])) return false
    }
    return true
}

fun main(argv: Array<String>) {
    println(sum3(intArrayOf(1, 2, 3)))
    println(max3(intArrayOf(1, 2, 3)))

    val time = measureTime{ 1 + 2 }
    println(time)

    println(check("Hello") { c -> c.isLetter()})
    println(check("hello") { it.isLowerCase()})

    println(check2("Hello") {_, c->c.isLetter()})
    println(check2("Hello") {i, c-> i == 0 || c.isLowerCase()})
}