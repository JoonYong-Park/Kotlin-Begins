package condition

fun main() {

    /* 조건에 따라 변수에 값 할당도 가능 */
    val dust: Int = 30
    var result: String = ""

    if (dust <= 35) {
        result = "놀 수 있다"
    } else {
        result = "집에서 논다"
    }
    println("result1 = $result")


    /* if문을 통한 변수 할당 */
    val dust2: Int = 40
    val result2: String = if (dust2 <= 35) {
        "놀 수 있다"
    } else {
        "집에서 논다"
    }
    println("result2 = $result2")

    /* when문을 통한 변수 할당 */
    val dust3: Int = 40
    val result3: String = when (dust3) {
        in 0 .. 35 -> "놀 수 있다"
        else -> "집에서 논다"
    }
    println("result3 = $result3")

}