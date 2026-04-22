fun main(){
   print("Enter an Integer value: ")
   val string1 = readLine()!!//"6"
   var num: Int = string1.toInt()//6
   println("you entered: $num")//6
   if (num > 0)
   {
       println("num is positive")
   }else if(num<0)
   {
       println("num is negative")
   }else{
       println("num is zero.")
   }
}
