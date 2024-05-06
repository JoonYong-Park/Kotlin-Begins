package function

import java.util.*

fun main() {

    /* 연습1 - 사칙 연산 */
    val sc = Scanner(System.`in`)
    print("첫번째 숫자를 입력해주세요: ")
    val first = sc.nextInt()
    print("두번째 숫자를 입력해주세요: ")
    val second = sc.nextInt()
    println("1.더하기 / 2.빼기 / 3.곱하기 / 4.나누기")
    print("연산을 선택해주세요: ")
    val select: Int = sc.nextInt()

    when (select) {
        1 -> println("result = ${add(first, second)}")
        2 -> println("result = ${sub(first, second)}")
        3 -> println("result = ${mul(first, second)}")
        4 -> println("result = ${div(first, second)}")
        else -> println("잘못된 연산입니다.")
    }

}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun sub(a: Int, b: Int): Int {
    return a - b
}

fun mul(a: Int, b: Int): Int {
    return a * b
}

fun div(a: Int, b: Int): Int {
    return a / b
}

