package condition

import java.util.*

fun main() {

    /* 연습1 - 학점 계산기 */
    val sc: Scanner = Scanner(System.`in`) // Scanner 객체 생성
    print("점수를 입력해주세요: ")
    val input :Int = sc.nextInt() // 입력받은 정수를 input 변수에 저장

    val grade: String = when (input) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        else -> "F"
    }
    println("학점: $grade")
    println("--------------------")

    /* 연습2 - 학점 계산기 */
//    val sc = Scanner(System.`in`)
    println("1.VVIP / 2.VIP / 3.GOLD / 4.SILVER")
    print("고객 등급을 입력해주세요: ")
    val grade2 = sc.nextInt()

    println("1.맥북(3,000,000원) / 2.LG 그램(2,500,000원) / 3.삼성 갤북(2,300,000원)" )
    print("구입 할 물품을 입력해주세요: ")
    val product = sc.nextInt()

    val salePercent = if (grade2 == 1) {
        30
    } else if (grade2 == 2) {
        15
    } else if (grade2 == 3) {
        10
    } else if (grade2 == 4) {
        0
    } else {
        println("예상치 못한 고객 등급을 입력하셨습니다.")
        return
    }

    val productPrice = if (product == 1) {
        3_000_000
    } else if (product == 2) {
        2_500_000
    } else if (product == 3) {
        2_300_000
    } else {
        println("예상치 못한 물품 목록을 입력하셨습니다.")
        return
    }
    val finalPrice = (productPrice / 100) * (100 - salePercent)
    println("finalPrice=$finalPrice")



}