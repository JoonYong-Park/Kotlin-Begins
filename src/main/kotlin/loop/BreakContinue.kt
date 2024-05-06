package loop

// break    : 반복문을 탈출
// continue : 반복문의 나머지 부분을 건너뛰고 다음 반복으로 이동
fun main() {

    /* for - break */
    for (i in 1..5) {
        if (i == 3) {
            break

        }
        println("i = $i")
    }

    /* while - break */
    var cnt = 0
    while (cnt < 5) {
        if (cnt == 3) {
            break
        }
        println("cnt = $cnt")
        cnt++
    }

    /* for - continue */
    for (i in 1..5) {
        if (i == 3) {
            continue // 3일 때는 출력하지 않고 다음 반복으로 이동
        }
        println("i = $i")
    }

    /* while - continue */
    var cnt2 = 0
    while (cnt2 < 5) {
        cnt2++
        if (cnt2 == 3) {
            continue // 3일 때는 출력하지 않고 다음 반복으로 이동
        }
        println("cnt2 = $cnt2")
    }
}