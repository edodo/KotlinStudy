val IntRange.leftHalf: IntRange
    get() = start..(start + endInclusive) / 2

val String.Companion.HELLO
    get() = "Hello"

fun main() {
    println((1..3).leftHalf) // 1..2
    println((3..6).leftHalf) // 3..4
    println(String.HELLO)
    println(String.Companion.HELLO)
}
