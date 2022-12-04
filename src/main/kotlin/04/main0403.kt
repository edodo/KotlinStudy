import java.lang.IllegalArgumentException

class Person7(val firstName: String, val familyName: String) {
    inner class Posession(val description: String) {
        fun showMe() = println(fullName())
    }
    private fun fullName() = "$firstName $familyName"
}

fun main() {
    val person = Person7("Choi", "Seongmin")
    val pose = person.Posession("csm")
    pose.showMe()

    class Point(val x: Int, val y: Int) {
        fun shift(dx: Int, dy: Int): Point = Point(x +dx, y +dy)
        override fun toString() = "($x, $y)"
    }
    val p = Point(10 ,10)
    println(p.shift(-1 , 3))
}
