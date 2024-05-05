package operator

fun main() {

    /* 1. 산술 연산자 */
    // +, -, *, /, %

    val a = 10
    val b = 5
    println(a + b) // 15
    println(a - b) // 5
    println(a * b) // 50
    println(a / b) // 2
    println(a % b) // 0

    /* 2. 복합 대입 연산자 */
    // +=, -=, *=, /=, %=

    var c = 10
    c += 5
    println(c) // 15
    c -= 5
    println(c) // 10
    c *= 5
    println(c) // 50
    c /= 5
    println(c) // 10
    c %= 5
    println(c) // 0

    /* 3. 증감 연산자 */
    // ++, --

    var d = 10
    d++
    println(d) // 11
    d--
    println(d) // 10

    /* 4. 비교 연산자 */
    // >, <, >=, <=, ==, !=

    val e = 10
    val f = 5
    println(e > f)  // true
    println(e < f)  // false
    println(e >= f) // true
    println(e <= f) // false
    println(e == f) // false
    println(e != f) // true

    /* 5. 논리 연산자 */
    // &&, ||, !

    // || - OR
    println(true || true) // true
    println(true || false) // true
    println(false || true) // true
    println(false || false) // false
    // && - AND
    println(true && true) // true
    println(true && false) // false
    println(false && true) // false
    println(false && false) // false
    // ! - NOT
    println(!true) // false
    println(!false) // true
    // 활용
    val trueValue: Boolean = true
    val falseValue: Boolean = false
    println(trueValue || falseValue) // true
    println(trueValue && falseValue) // false
    println(!trueValue) // false

    /* 6. 범위 연산자 */
    // .., until, downTo, step

    val i = 1..10
    val j = 1 until 10
    val k = 10 downTo 1
    val l = 10 downTo 1 step 2

    println(i.toList()) // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    println(j.toList()) // [1, 2, 3, 4, 5, 6, 7, 8, 9]
    println(k.toList()) // [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
    println(l.toList()) // [10, 8, 6, 4, 2]

}