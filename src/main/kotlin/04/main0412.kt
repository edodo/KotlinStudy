object Application {
    val name = "My Application"
    override fun toString() = name
    fun exit() {}
}

fun describe(app: Application) = app.name

fun main() {
    println(Application)
}
