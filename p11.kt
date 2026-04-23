//when expression examples
//ex 1
fun main() {
    var number = 5
    var numberProvided = when (number) //5
    {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        5 -> "Five"
        else -> "invalid number"
    }
    println("You provided $numberProvided")
}

//ex 2- multiple statement of when using braces
fun main(){
    var number = 7
    when(number){   //Multiple statement of when using braces
        1->
        {
            println("Monday")
            println("First day of the week")
        }
        7 -> println("Sunday")
        else -> println("Other days")
    }
}


