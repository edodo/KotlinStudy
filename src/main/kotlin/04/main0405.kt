
fun main(argv: Array<String>) {
    var name: String? = null
    fun initialize() {
        name = "Jon"
    }

    fun sayHello() {
        println(name!!.uppercase())
    }

    initialize()
    sayHello()
    println(readInt2()?.toInt()?.toString(16))

}


fun readInt2(): Int? {
    val tmp = readLine()
    return if(tmp !=null) tmp.toInt() else null
}
