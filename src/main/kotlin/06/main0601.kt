import java.lang.IllegalArgumentException
import WeekDay.*

enum class WeekDay {
    MONDAY { fun startWork() = println("Work week started")}, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

fun WeekDay.isWorkDay() =
    this == WeekDay.SATURDAY || this == WeekDay.SUNDAY

fun rotateWise(weekday: WeekDay) = when (weekday) {
    MONDAY -> TUESDAY
    TUESDAY -> WEDNESDAY
    WEDNESDAY -> THURSDAY
    THURSDAY -> TUESDAY
    THURSDAY -> FRIDAY
    FRIDAY -> SATURDAY
    SATURDAY -> SUNDAY
    SUNDAY -> MONDAY
    else ->
        throw IllegalArgumentException("Invalid WeekDay: $weekday")
}

fun main() {
    println( MONDAY.isWorkDay() )
    println( SATURDAY.isWorkDay() )
    println(rotateWise(MONDAY))
    println(MONDAY.name)
    println(MONDAY.ordinal)
    println(WEDNESDAY.name)
    println(WEDNESDAY.ordinal)

    val weekdays = enumValues<WeekDay>()

    println(weekdays[2])
    println(enumValueOf<WeekDay>("THURSDAY"))
}
