//Kotlin when Expression
fun main(){
    print("Enter the full name: ")
    var name = readLine()!!.toString()
    when(name)
    {
        "Sun" -> print("Sun is a star.")
        "Moon" -> print("Moon is a satellite.")
        "Earth" -> print("Earth is a planet.")
        else -> print("I don't know anything about it.")
    }
}
