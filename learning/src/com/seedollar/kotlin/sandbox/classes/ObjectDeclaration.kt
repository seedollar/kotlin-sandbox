package com.seedollar.kotlin.sandbox.classes

import java.io.Serializable

fun main(args: Array<String>) {

    println("Pi: ${StaticValues.pi}")

}

// Object declarations are Singletons in Kotlin. Object declarations can also extend other interfaces
// Object declarations are initialized lazily
object StaticValues : Serializable {
    val pi: Double = 3.14
}

