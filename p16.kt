typealias User = Triple<String, String, Int>

fun userInfo(): User {
    return Triple("Zara", "Alisha", 32)
}

fun main() {
    val obj = userInfo()
    print(obj)
}
