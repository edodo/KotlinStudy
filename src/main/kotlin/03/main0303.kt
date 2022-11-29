import kotlin.random.Random

fun hexDigit(n: Int): Char {
    when{
        n in 0..9 -> return '0' + n
        n in 10..15 -> return 'A' + n - 10
        else -> return '?'
    }
}

fun numberDescription(n: Int, max: Int = 100): String = when (n) {
    0 -> "Zero"
    1,2,3 -> "Small"
    in 4..9 -> "Medium"
    in 10..max -> "Large"
    !in Int.MIN_VALUE until 0 -> "Negative"
    else -> "Huge"
}
fun main(argv: Array<String>) {
    // when
    println(hexDigit(12))
    println( numberDescription(10))
    println( numberDescription(-2))

    // do while
    var sum = 0
    var nm = 0
    do {
        //nm = readLine()!!.toInt()
        sum += nm
    } while(nm != 0)
    println("Sum: $sum")

    // while
    val num = Random.nextInt(1, 101)
    var guess = 0
/*
    while (guess != num) {
        guess = readLine()!!.toInt()
        if (guess < num) println("Too small")
        else if (guess > num) println("Too big")
    }
*/
    println("Right: it's $num")

    val a = IntArray(10) { it*it }
    var result: Int = 0
    for(x in a) {
        result += x
    }

    println("Sum : $result")
}