import java.lang.IllegalArgumentException

fun sum(numbers: IntArray): Int {
    var result = numbers.firstOrNull()
        ?: throw IllegalArgumentException("Empty array")
    for (i in 1..numbers.lastIndex) result += numbers[i]

    return result
}

fun aggregate(numbers: IntArray, op: (Int, Int) -> Int): Int {
    var result = numbers.firstOrNull()
        ?: throw IllegalArgumentException("Empty array")

    for (i in 1 .. numbers.lastIndex) result = op(result, numbers[i])
    return result
}
fun sum1(numbers: IntArray) = aggregate(numbers, { result, op -> result + op } )
fun max(numbers: IntArray) = aggregate(numbers, { result, op -> if(op > result) op else result})

fun main(argv: Array<String>) {
    /*
    val squares = IntArray(5) { n -> n*n }
    squares.forEach { println(it) }

    println(sum(intArrayOf(1,2,3)))
    */
    println(sum1(intArrayOf(1,2,3)))
    println(max(intArrayOf(1,2,3)))
}