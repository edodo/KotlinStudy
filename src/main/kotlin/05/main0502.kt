fun measureTime(action: (() -> Unit)?): Long {
    val start = System.nanoTime()
    action?.invoke()
    return System.nanoTime() - start
}
fun interface StringConsumer {
    fun accept(s:String)
}
fun main(argv: Array<String>) {
    val consume = StringConsumer{s -> println(s)}
    consume.accept("csm0222")

    val lessThan: (Int, Int) -> Boolean = { a, b -> a < b }
    println(lessThan(1,2))

    println( measureTime(null) )

    val shifter: (Int) -> (Int) -> Int = { n -> {i -> i + n } }
    val inc = shifter(1)
    val dec = shifter(-1)
    println(inc(10))
    println(dec(10))
}