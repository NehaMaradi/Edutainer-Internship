fun main(){
    print("Enter an Integer value: ")
    val string1 = readLine()!!
    var integerValue: Int = string1.toInt() //.toInt() function converts string to int print
    print("Enter a double value: ")
    val string2 = readLine()!!
    var doubleValue: Double = string2.toDouble()
    println("you entered: $doubleValue")
}
