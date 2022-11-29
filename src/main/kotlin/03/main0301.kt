import kotlin.math.PI

// import java.lang.Math       // JDK 클라스
// import foo.bar.util.readInt // 최상위 함수
import kotlin.Int.Companion.MIN_VALUE

fun circleArea(radius: Double): Double {
    return PI*radius*radius
}
fun rectangleArea(width: Double, height: Double): Double {
    return width * height
}
fun swap(s: String, from: Int, to: Int): String {
    val chars = s.toCharArray() // 배열로 변환
    // 배열 원소 교환하기
    val tmp = chars[from]
    chars[from] = chars[to]
    chars[to] = tmp
    return chars.concatToString() // 문자열로 다시 변환
}


val n = 100
fun fromMin(steps: Int) = MIN_VALUE + n // MIN_VALUE를 간단한 이름으로 가리킴

fun printSorted(vararg items: Int) {
    items.sort()
    println(items.contentToString())
}

fun max(a: Int, b:Int): Int {
    if( a > b) return a
    else return b
}
fun maxx(a: Int, b: Int) = if(a>b) a else b

fun renamePackage(fullName: String, newName: String): String {
    val i = fullName.lastIndexOf('.')
    val prefix = if(i >= 0) fullName.substring(0, i+1) else return newName
    return prefix + newName
}

fun main(args: Array<String>) {
    if(args.isNotEmpty()) {
        val message = "Hello, ${args[0]}"
        println(message)
    } else {
        println("empty param")
    }
    print("Enter radius: ")
    val radius: Double = 9.0
    println("Circle area: ${circleArea(radius)}")
    /*
    val w = readLine()!!.toDouble()
    val h = readLine()!!.toDouble()
    println("Rectangle : ${rectangleArea(w,h)}")
    */

    println(swap("Hello", 1, 2)) // Hlelo
    println(swap("Hello", from = 1, to = 2)) // Hlelo
    println(swap("Hello", to = 3, from = 0)) // lelHo
    println(swap("Hello", 1, to = 3)) // Hlleo
    println(swap(from = 1, s = "Hello", to = 2)) // Hlelo
    // 위치 기반 인자와 이름 붙은 인자를 혼용한 경우
    println(swap(s = "Hello", 1, 2))      // 1.4 이전에는 컴파일 오류. 1.4부터는 정상
    println(swap(s = "Hello", 1, to = 2)) // 1.4 이전에는 컴파일 오류. 1.4부터는 정상
    /*
    println(swap(s = "Hello", 2, from = 1)) // error: an argument is already passed for this parameter
                                            // error: no value passed for parameter 'to'
    println(swap(1, 2, s = "Hello"))        // the integer literal does not conform to the expected type String
                                            // error: an argument is already passed for this parameter
                                            //error: no value passed for parameter 'to'
    */

    val a = intArrayOf(6, 2, 10, 1)
    printSorted(*a)
    printSorted(6, 1, *intArrayOf(3,8), 2)
    //println(readInt() + readInt())

    println(max(1, 2))
    println(maxx(4, 2))

    println(renamePackage("csm.0222", "choiseongmin"))
}