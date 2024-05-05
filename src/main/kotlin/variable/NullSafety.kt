package variable

fun main() {

    /* Null Safety */
    var name: String = "박준용" // 정상 동작
//    name = null               // 컴파일 에러 발생
    var nullableName: String? = null // 정상 동작

    val length1 = name.length           // 정상 동작
//    val length2 = nullableName.length   // 컴파일 에러 발생

    /* 1. 조건문을 활용하여 null 체크 */
    if (nullableName != null) {
        println(nullableName.length)
    }

    /* 2. ?. 연산자를 통해 안전하게 호출 */
    println(nullableName?.length)

    /* 3. ?: 엘비스 연산자(Elvis Operator) */
    var name3: String? = null
    val length: Int = name3?.length ?: 0
    println(length)

    /* 4. !! 연산자 */
    var name4: String? = "JOONYONG PARK"
    println(name4!!.length)

}