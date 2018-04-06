package com.seedollar.kotlin.sandbox.classes

class Outer {
    private val outerName : String = "outer"
    class Nested {
        fun nestedPrint(): Int {
            // We cannot see the 'outerName' member variable of Outer class here.
            return 9732
        }
    }
}

fun main(args: Array<String>) {
    println(Outer.Nested().nestedPrint())
}
