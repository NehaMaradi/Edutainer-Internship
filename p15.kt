//Kotlin nested class
fun main()
{
    val obj =Outer.Nested()
    print(obj.foo())
}

class Outer
{
    class Nested{
        fun foo() = "Welcome to Android Development"
    }
}
