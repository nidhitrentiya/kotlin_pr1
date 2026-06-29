fun main(){
    var n=111
    var m=2222
    println("Addition of 111,2222 is ${n+m}")
    println("subtraction of 111,2222 is ${n-m}")
    println("Multiplication of 111,2222 is ${n*m}")
    println("Division of 2222,111 is ${m/n}")
}
fun add(n:Int,m:Int ):Int{
    var result=n+m
    return result
}
fun sub(n:Int,m:Int):Int{
    var result=n-m
    return result
}
fun multiply(n:Int,m:Int):Int{
    var result=n*m
    return result
}
fun div(m:Int,n:Int):Int{
    var result=m/n
    return result
}