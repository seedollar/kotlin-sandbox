package com.seedollar.kotlin.sandbox.classes

fun main(args: Array<String>) {
    val processor = PrimaryProcessor()
    println(processor.process())
}

// We need the 'open' keyword to not make DefaultProcessor final.
open class DefaultProcessor {
    // We use the 'open' keyword so that the process() function can be overridden by concrete implementations
    open fun process(): String = "default process"
}

class PrimaryProcessor: DefaultProcessor() {
    override fun process(): String {
        return "primary process"
    }
}
