import kotlin.random.Random
fun countLetters(text: String): IntArray {

    val counts = IntArray('z' - 'a' + 1)
    for (char in text) {
        val charLower = char.lowercaseChar()
        if(charLower !in 'a'..'z') continue
        counts[charLower - 'a']++
    }
    return counts
}

fun indexOf(subarray: IntArray, array: IntArray): Int {
    outerLoop@ for (i in array.indices) {
        for(j in subarray.indices) {
            if(subarray[j] != array[i + j]) continue@outerLoop
        }
        return i
    }
    return -1
}

/**
 * 꼬리재귀함수
 */
tailrec fun binIndexOf(
    x: Int,
    array: IntArray,
    from: Int = 0,
    to: Int = array.size
): Int{
    if (from == to) return -1
    val midIndex = (from + to -1 ) /2
    val mid = array[midIndex]
    return when {
        mid < x -> binIndexOf(x, array, midIndex +1, to)
        mid > x -> binIndexOf(x, array, from, midIndex)
        else ->midIndex
    }
}
fun main(argv: Array<String>) {

    val num = Random.nextInt(1, 101)
    /*
        while(true) {
            val guess = readLine()!!.toInt()
            val message =
            if (guess < num) println("Too small")
            else if (guess > num) println("Too big")
            else break
            println(message)
        }
    */

    loop@ while(true) {
        val guess = readLine()!!.toInt()
        val message = when {
            guess < num -> "Too small"
            guess > num ->  "Too big"
            else ->break@loop
        }
        println(message)
    }

    for(x in countLetters("aaacSm")) {
        println(x)
    }
}