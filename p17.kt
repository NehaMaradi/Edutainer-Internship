//Kotlin Nested Class
fun main() {
    val obj = Outer2.Nested()
    print(obj.foo())
}
class Outer2 {
    class Nested {
        fun foo()="Welcome to Android development"
    }
}
