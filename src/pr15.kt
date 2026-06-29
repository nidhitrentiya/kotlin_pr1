fun main(){
    println("enter the name")
    val month=readln().toInt()
    val month_name = when (month){
        1 -> println("january")
        2 -> println("february")
        3 -> println("march")
        4 -> println("april")
        5 -> println("may")
        6 -> println("june")
        7 -> println("july")
        8 -> println("August")
        9 -> println("september")
        10 -> println("October")
        11 -> println("November")
        12 -> println("December")
        else -> println("enter  the proper number")
    }
}