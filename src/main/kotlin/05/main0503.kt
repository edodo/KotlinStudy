
fun sum3(numbers: IntArray) =
    aggregate(numbers, { result, op -> result + op})
fun max3(numbers: IntArray) =
    aggregate(numbers, { result, op -> if (op > result ) op else result })


fun main(argv: Array<String>) {
    println(sum3(intArrayOf(1, 2, 3)))
    println(max3(intArrayOf(1, 2, 3)))
}