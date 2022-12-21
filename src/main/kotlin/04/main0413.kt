class Application2 private constructor(val name: String) {
    companion object {
        fun create(args: Array<String>): Application2? {
            val name = args.firstOrNull() ?: return null
            return Application2(name)
        }
    }
}

fun main(args: Array<String>) {
    val app = Application2.create(arrayOf("Choi", "Seongmin")) ?: return
    println("Application2 started: ${app.name}")
}
