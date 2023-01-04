fun aggregate512(numbers: IntArray, op: Int.(Int) -> Int): Int {
    var result = numbers.firstOrNull()
        ?: throw IllegalArgumentException("Empty array")

    for(i in 1..numbers.lastIndex) result = result.op(numbers[i])

    return result
}

fun sum512(numbers: IntArray) = aggregate(numbers) { op -> this + op }
