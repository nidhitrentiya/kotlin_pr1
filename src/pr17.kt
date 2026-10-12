fun main(){
    println("enter the number")
    val number=readln().toInt()
    val result = factorial (number)
    val result2 = factorial2(number)
    println("Factorial of $number =$result")
    println("By tailRec keyword, Factorial of $number =$result2")
}
fun factorial(n: Int): Long{
    if (n<=1){
        return 1
}
    return n * factorial(n - 1)
}
tailrec fun factorial2(n: Int, result2: Long = 1): Long{
    if (n<=1){
        return result2
    }
    return  factorial2(n - 1, n * result2)
}