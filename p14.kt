class myClass
{  //Property(data member)
private var name:String = "LoveAndroid"
    fun printMe()     //Member function
    {
        print("The best Learning website-"+name)
    }
}
fun main() {
    val obj = myClass()   //create object obj of myClass class
    obj.printMe()       //call the function
}
