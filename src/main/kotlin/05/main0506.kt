inline fun indexOf(numbers: IntArray, condition: (Int) -> Boolean): Int {
    for ( i in numbers.indices) {
        if (condition(numbers[i])) return i
    }
    return -1
}

var lastAction: () -> Unit = {}

inline fun runAndMemorize(action: () -> Unit) {
    action()
    // lastAction = action // inline 함수에서는 널이 될수 있는 함수 타입의 인자를 받을수 없다
}

inline fun forEach(a: IntArray, noinline action: ((Int) -> Unit) ? ) { // 람다를 inline 하지 말라는 noinline 변경자
    if (action == null) return
    for (n in a) action(n)
}

class Person56 (private val firstName: String,
                private val familyName:String) {
    inline fun sendMessage(message: () -> String) {
        // println("$firstName $familyName: ${message()}") // 인라인 함수로 private 멤버 전달 하면 오류로 사용금지.
    }
}
fun main(argv: Array<String>) {
    println(indexOf(intArrayOf(5, 3, 1, 4,3,2,1)) { it < 3 } )

}
