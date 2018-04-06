package com.seedollar.kotlin.sandbox.classes

import java.util.function.Consumer
import java.util.function.Supplier

fun main(args: Array<String>) {

    // Java Lambda interface object reference
    val javaSupplier = Supplier {
        "javaSupplier"
    }

    println(javaSupplier.get())

    // Consumer lambda
    val javaConsumer = Consumer<Int> {
        if (it % 2 == 0) {
            println("number is even")
        } else {
            println("number is odd")
        }
    }

    javaConsumer.accept(9793)
}

