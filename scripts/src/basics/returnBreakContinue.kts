package basics

import java.util.*

val random = Random()

run {
    for (i in 1..100) {
        for (j in 1..100) {
            if (random.nextInt() == 2) break
        }
    }
}

run {
    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (random.nextInt() == 2) break@loop
        }
    }
}
