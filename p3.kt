//Logical Operators
//Example 1
fun main(){
    val a =10
    val b =9
    val c = -1
    val result: Boolean //result is true if a is largest
    result = (a>b) && (a>c) //result=(a>b)and(a>c)=> true
    println(result)
}

/*Example 2 - AND operator, OR operator, NOT operator*/
fun main(){
    var x = 100
    var y = 25
    var z = 10
    var result = false
    if(x > y && x > z)   //100>25 true && 100>10 true = true
        println(x) //100
    if(x < y || x>z)    //100<25 false || 100>10 true = true
        println(y) //25
    if(result.not())   //result = false not= true
        println("Logical operators") //this will print
}


/*Bitwise Operators - operations happen on bits
Named Function    Description             Expression
shl(bits)         signed shift left         a.shl(b)
shr(bits)         signed shift right        a.shr(b)
ushr(bits)        unsigned shift right      a.ushr(b)
and(bits)         bitwise and               a.and(b)
or(bits)          bitwise or                a.or(b)
xor(bits)         bitwise xor               a.xor(b)
inv()             bitwise inverse           a.inv()
*/
fun main()
{
    println(5.shl(1)) //Value 5 is signed shift left by 1 bit
    println(10.shr(2)) //Value 10 is shift right by 2 bits
    println(12.ushr(2)) //Value 12 is unsigned shift right by 2 bits
    println(36.and(22)) //Value 36 is bitwise and with 22
    println(36.or(22)) //Value 36 is bitwise or with 22
    println(26.xor(22)) //value 26 is bitwise xor with 22
    println(14.inv())          //Value 14 is bitwise inverse -(n+1) = -(14+1) = -15
}
