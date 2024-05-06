package loop

fun main() {


    /* for문 - .. 사용*/
    for (index:Int in 1..5) {
        println("index = $index")
    }
    for (i in 1..5) {
        println("i = $i")
    }

    /* for문 - until 사용 */
    for (index:Int in 1 until 5) {
        println("index = $index")
    }
    for (i in 1 until 5) {
        println("i = $i")
    }

    /* for문 - step 사용 */
    for (index:Int in 1..5 step 2) {
        println("index = $index")
    }
    for (i in 1..5 step 2) {
        println("i = $i")
    }

    /* for문 - downTo 사용 */
    for (index:Int in 5 downTo 1) {
        println("index = $index")
    }
    for (i in 5 downTo 1) {
        println("i = $i")
    }

    /* for문 - downTo, step 사용 */
    for (index:Int in 5 downTo 1 step 2) {
        println("index = $index")
    }
    for (i in 5 downTo 1 step 2) {
        println("i = $i")
    }

    /* String의 for문 */
    val str = "박준용"
    for (index: Int in 1 .. str.length) {
        println("index = $index, str[$index-1] = ${str[index-1]}")
    }
    for (i in 1 .. str.length) {
        println("i = $i, str[i-1] = ${str[i-1]}")
    }


}