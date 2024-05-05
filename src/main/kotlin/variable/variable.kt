package variable

fun main() {

    println("Hello, World!")

    /* 변수의 기본 형태 */
    /* var/val 변수명: 변수 타입 = 초기화값 */
    var name: String = "박준용"
    val age: Int = 26
    val alive: Boolean = true

    /* 변수명은 변수의 목적에 맞게 본인이 마음대로 정할 수 있습니다.*/
    /* 가끔 이미 코틀린(Kotlin)에서 사용되고 있는 예약어(ex. val , in, for, if 등)를 변수에 사용해야 될 경우가 있습니다.*/
    /* 변수명을 변경할 수도 있지만 반드시 사용해야되는 경우 `를 변수 양쪽에 위치 시키면 됩니다.*/
//    val in: Int = 0 // 컴파일 에러 // 컴파일 에러 - Kotlin: Expecting property name or receiver type
    val `in`: Int = 0 // 정상 동작

    /* 숫자로 시작할 수 없습니다. */
//    var 1st: Int // 컴파일 에러
    var first1: Int // 정상 동작

    /* Integer types(정수형) */
    val one = 1                   // Int
    val threeBillion = 3000000000 // Long
    val oneLong = 1L              // Long
    val oneByte: Byte = 1         // Byte
    val threeBillionUnderbar = 3_000_000_000 // Long 개발자 편의를 위해 _를 사용하여 가독성을 높일 수 있습니다.

    /* Floating-point types(실수형) */
    val pi = 3.14              // Double
  //val one2: Double = 1       // Error: type mismatch
    val e = 2.7182818284       // Double
    val eFloat = 2.7182818284f // Float, actual value is 2.7182817

    /* Boolean type(부울형) */
    val isAlive: Boolean = true

    /* 문자열(String) */
    val name2:String = "박준용"
    val age2:Int = 26
    val result:String = "이름: $name2, 나이: $age2"
    println(result)

}