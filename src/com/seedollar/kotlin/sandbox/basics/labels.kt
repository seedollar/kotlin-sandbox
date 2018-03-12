package com.seedollar.kotlin.sandbox.basics

fun main(args: Array<String>) {

    // Create a label to which we can jump to
    topLoop@ for (x in 1..100) {
        println("x = $x")
        for (y in 1..10) {
            if (y %2 == 0) break@topLoop
        }
    }

}