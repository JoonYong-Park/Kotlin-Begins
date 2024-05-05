package variable

fun main() {

    /* 연습 1 */
    // 이름, 나이, 주소, 생존여부를 선언하고 출력
    val name = "박준용"
    val age = 26
    val address = "대전광역시"
    val isAlive = true

    println("이름: $name, 나이: $age, 주소: $address, 생존여부: $isAlive")

    val name2: String = "장지용"
    val age2: Int = 27
    val address2: String = "경기도 안산"
    val isAlive2: Boolean = true

    println("이름: $name2, 나이: $age2, 주소: $address2, 생존여부: $isAlive2")

    /* 연습 2 */
    // 알맞은 변수타입 삽입
    val age3: Int = 10
    val pi3: Double = 3.1415
    val isPossible3: Boolean = true
    val constructionCosts3: Long = 5_000_000_000
    val name3: String = "박준용"

}