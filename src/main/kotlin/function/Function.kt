package function

fun main() {

    val result: Int = sum(1, 2)
    println("result = ${result}")
    println("sum(3, 5) = ${sum(2, 3)}")
    println("------------------------------------")

    println(sum(1, 2))
    sumPrint(1, 2)
    println(getSystemCurrentTime())
    log()
}

// input: O / output: O
fun sum(a: Int, b: Int): Int {
    return a + b
}

// input: O / output: X
fun sumPrint(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

// input: X / output: O
fun getSystemCurrentTime(): Long {
    return System.currentTimeMillis()
}

// input: X / output: X
fun log() {
    println("log")
}