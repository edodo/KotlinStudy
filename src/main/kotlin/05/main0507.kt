fun forEach571(a: IntArray, action: (Int) -> Unit) {
    for ( n in a) action(n)
}

fun main(args: Array<String>) {
    // 메인에서 return 사용시 오류
    forEach571(intArrayOf(1,2,3,4)) {
        //if ( it < 2 || it > 3 ) return // 오류
        println(it)
    }

    // 함수 이름을 lable로 사용
    forEach571(intArrayOf(1,2,3,4)) {
        if ( it < 2 || it > 3 ) return@forEach571 //정상
        println(it)
    }

    // 람다로 만든 main의 return
    forEach571(intArrayOf(1, 2, 3, 4), fun(it: Int) {
        if( it < 2 || it > 3 ) return
        println(it)
    })

    // 레이블을 붙여 return
    val action:(Int) -> Unit = myFin@{
        if (it < 2 || it > 3) return@myFin
        println(it)
    }

    // 함수이름을 lable로 사용
    if(args.isEmpty()) return@main
    println(args[0])
}