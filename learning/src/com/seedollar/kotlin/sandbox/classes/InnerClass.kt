package com.seedollar.kotlin.sandbox.classes

class OuterClazz {
    private val outerName: String = "outer"

    inner class Inner {
        fun showInner(): String {
            return outerName // Inner class can reference outer class member variables
        }
    }
}

fun main(args: Array<String>) {
    println(OuterClazz().Inner().showInner())
}
