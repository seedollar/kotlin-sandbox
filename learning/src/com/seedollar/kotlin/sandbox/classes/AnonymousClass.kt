package com.seedollar.kotlin.sandbox.classes

fun main(args: Array<String>) {
    // Create an anonymous class instance of Adapter and override the adapt method.
    applyAdapter(object:Adapter() {
        override fun adapt(): String = "overridden adapted"
    })

    val anonymousAdapter = object:Adapter() {
        override fun adapt(): String {
            return "anonymous object adapted"
        }
    }

    applyAdapter(anonymousAdapter)
}

// Take note that we have to use the 'open' keyword so that the class is extensive else it's final by default
open class Adapter {
    open fun adapt(): String = "adapted"
}

fun applyAdapter(adapter: Adapter) {
    println(adapter.adapt())
}