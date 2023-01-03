package util2
fun String.truncate(maxLength: Int): String {
    return if (length <= maxLength ) this else substring(0, maxLength)
}

