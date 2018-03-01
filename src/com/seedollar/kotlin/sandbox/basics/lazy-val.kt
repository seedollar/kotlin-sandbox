package com.seedollar.kotlin.sandbox.basics

import java.util.concurrent.atomic.AtomicInteger

fun main(args: Array<String>) {

    var invocationCounter: AtomicInteger = AtomicInteger(0)

    val lazyLabel : String by lazy {
        invocationCounter.incrementAndGet()
        for (x in 1..200) {println("looping...$x")}
        "invoked: ${invocationCounter.get()}"
    }

    // The atomic integer is only invoked once, subsequent references to this variable do not increment the atomic integer
    println(lazyLabel)
    println(lazyLabel)
    println(lazyLabel)

}

