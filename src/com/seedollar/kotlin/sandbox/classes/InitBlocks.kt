package com.seedollar.kotlin.sandbox.classes

fun main(args: Array<String>) {

    val initBlockDemo: InitBlockDemo = InitBlockDemo("demo")

}

class InitBlockDemo(tag: String) {

    val firstProperty = "First property '$tag'".also(::println)

    init {
        println("First init block that prints '$tag'")
    }

    val secondProperty = "Second property: ${tag.length}".also(::println)

    init {
        println("Second init block that prints: ${tag.length}")
    }

}