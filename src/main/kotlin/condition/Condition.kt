package condition

fun main() {

    /* if, else if, else */
    val dust: Int = 17
    if (dust <= 15) {
        println("좋음")
    } else if (dust <= 35) {
        println("보통")
    } else if (dust <= 75) {
        println("나쁨")
    } else {
        println("매우 나쁨")
    }
    println("--------------------")

    /* when*/
    val number: Int = 3

    when (number) {
        0 -> println("0 입니다.")
        1 -> println("1 입니다.")
        2 -> println("2 입니다.")
        3 -> println("3 입니다.")
        4 -> println("4 입니다.")
        5 -> println("5 입니다.")
        else -> println("그 외 입니다.")
    }
    println("--------------------")

    /* when - 다중 조건 */
    val score: Int = 95

    when (score) {
        in 90..100 -> println("A")
        in 80..89  -> println("B")
        in 70..79  -> println("C")
        in 60..69  -> println("D")
        else -> println("F")
    }

}