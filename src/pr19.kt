fun main() {
    println("Enter numbers:")
    val n = readLine()!!.toInt()
    val numbers = IntArray(n)

    for (i in 0 until n) {
        print("a[$i] = ")
        numbers[i] = readLine()!!.toInt()
    }

    val max = numbers.maxOrNull()

    println("Largest Number = $max")
}