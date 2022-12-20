package main
import util.prefix
import java.io.File

class Content {
    // var text: String? = null
    lateinit var text: String

    fun loadFile(file: File) {
        text = file.readText()
    }
}

fun getContentSize(content: Content) = content.text?.length ?: 0

fun main() {
    val name = readLine() ?: return
    println("$prefix$name")

}