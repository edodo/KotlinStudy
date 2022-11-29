fun main(argv: Array<String>) {
    // 범위, 진행, 연산
    val chars = 'a'..'h'
    val towDigits = 10..99
    val zeroToOne = 0.0..1.0
    println (chars)
    println (towDigits)
    println (zeroToOne)

    // 범위안 in, 범위밖 !in
    val num = 11
    println (num !in 10..99)
    println ("def" in "abc".."xyz")
    println ("zzz" in "abc".."xyz")

    // 범위제외 until
    val twoDigits = 10 until 100 // 10..99와 같음

    // 진행: 간격만큼 떨어져 있는 값들 downTo, step
    println("downTo : " + (5 in 10 downTo 1)) // true
    println("downTo : " + (5 in 1 downTo 10)) // false
    //(1..10 step 3)
    //(11..1 step 2)

    println(IntArray(10) { it * it }.sliceArray(2 until 5)) // 4, 9,  16, 25
}