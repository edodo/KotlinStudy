fun parseIntNumber(s: String): Int {
    var num = 0

    if(s.length !in 1..31) throw NumberFormatException("Not a number: $s")

    for(c in s) {
        if(c !in '0'..'1') throw NumberFormatException("Not a number: $s")
        num = num*2 + (c - '0')
    }
    return num
}
fun sayHello(name: String) {
    val message =
        if (name.isNotEmpty()) "Hello, $name"
        else throw IllegalArgumentException("Empty name")

    println(message)
}
fun readInt(default: Int): Int{
    try{
        return readLine()!!.toInt()
    } catch (e: NumberFormatException) {
        return default
    } finally {
        println("Error")
    }
}
fun main(argv: Array<String>) {
    //sayHello("")
    readInt(123)
}
