
val prefix = "Hello, "
fun main(argv: Array<String>) {
    val name = readLine() ?: return
    println("$prefix$name")
}