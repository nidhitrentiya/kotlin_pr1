fun main(){
    println("Enter the number")
    val number =readln().toInt()
    println(
        if(number%2==0)
        "even"
        else
        "odd"
    )
}