package array

import java.util.*
import kotlin.random.Random


fun main() {
    /* 연습1 - 5개의 정수를 입력받아 평균 */
    val sc = Scanner(System.`in`)
    val numbers = Array(5) { 0 }
    for (i in numbers.indices) {
        print("숫자를 입력해주세요: ")
        numbers[i] = sc.nextInt()
    }
    val total = numbers.sum()
    val average = total / numbers.size
    println("average=$average")

    /* 연습2 - 랜덤 */
    val randomNumbers = Array(10) { Random.nextInt(100) + 1 }
    var min: Int = randomNumbers[0]
    var max: Int = randomNumbers[0]
    for (number in randomNumbers) {
        if (number < min) {
            min = number
        }
        if (number > max) {
            max = number
        }
    }
    println("max=$max")
    println("min=$min")

}