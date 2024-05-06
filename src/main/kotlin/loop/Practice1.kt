package loop

import java.util.*

fun main() {
    /* 연습1 - 별 */
    var sc: Scanner = Scanner(System.`in`)
    val num = sc.nextInt()

    for(i in 1..num) {
        for(j in 1..i) {
            print("*")
        }
        println()
    }

    /* 연습2 - 구구단 */
    println("숫자를 입력해주세요: ")
    val number = sc.nextInt()
    for (i in 1..10) {
        println("$number x $i = ${number * i}")
    }

}