import java.io.File

val text by lazy {
    File("date.txt").readText()
}

fun main() {
    while (true) {
        when (val command = readLine() ?: return) {
            "print data" ->println(text)
            "exit" -> return
        }
    }
}
