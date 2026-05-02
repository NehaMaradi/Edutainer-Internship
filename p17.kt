//Kotlin Nested Class eg1
fun main() {
    val obj = Outer2.Nested()
    print(obj.foo())
}
class Outer2 {
    class Nested {
        fun foo()="Welcome to Android development"
    }
}

//eg 2
fun main(){
    val obj = Outer3().Inner3()
    print(obj.foo())
}
class Outer3{
    private val welcomeMessage: String = "Welcome to Android development"
    inner class Inner3{
        fun foo() = welcomeMessage
    }
}
