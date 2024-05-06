package array

fun main() {

    /* 1. 배열의 크기를 정하고 초기값 지정하여 생성 */
    val arr = Array<Int>(3) { 0 }
    println("arr[0] = ${arr[0]}")
    println("arr[1] = ${arr[1]}")
    println("arr[2] = ${arr[2]}")
    arr[0] = 10
    arr[1] = 20
    arr[2] = 30
    println("arr[0] = ${arr[0]}")
    println("arr[1] = ${arr[1]}")
    println("arr[2] = ${arr[2]}")
    println("arr.size = ${arr.size}")

    println("------------------------------------")
    /* 2. 특정값을 넣어서 배열을 생성하는 경우 */
    val arr2 = arrayOf<Int>(10, 20, 30)
    println("arr2[0] = ${arr2[0]}")
    println("arr2[1] = ${arr2[1]}")
    println("arr2[2] = ${arr2[2]}")
    println("arr2.size = ${arr2.size}")

    println("------------------------------------")
    /* 2중 배열 */
    val records = arrayOf(
        arrayOf(1, 2, 3, 4, 5),
        arrayOf(6, 7, 8, 9, 10),
    )
    records[0][2] = 33
    for (row in records) {
        for (column in row) {
            print("value=$column ")
        }
        println()
    }



}