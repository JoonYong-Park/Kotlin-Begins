package loop

fun main() {
    // 중첩 반복문
    for (outIndex in 0..3) {
        println("outIndex 시작=$outIndex")
        for (inIndex in 0..3) {
            println("    inIndex=$inIndex")
        }
        println("outIndex 종료=$outIndex")
    }
}