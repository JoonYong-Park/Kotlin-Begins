package operator

fun main() {

    /* 연습1 */
    // 과목 평균 구하기
    val korean = 95
    val english = 85
    val math = 100

    val average = (korean + english + math) / 3
    println("평균: $average")

    /* 연습2 */
    // Pass or Fail - 90점 이상 Pass, 90점 미만 Fail
    val koreanPass:Boolean = korean >= 90
    val englishPass:Boolean = english >= 90
    val mathPass:Boolean = math >= 90

    println("Korean Pass: $koreanPass")
    println("English Pass: $englishPass")
    println("Math Pass: $mathPass")

    // 모든 과목이 90점 이상이어야 Pass
    val finalPass = koreanPass && englishPass && mathPass
    println("Final Pass: $finalPass")

}