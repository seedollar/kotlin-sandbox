package com.seedollar.kotlin.sandbox.classes

fun main(args: Array<String>) {
    // The companion keyword allows you to refer to the member function as if it were part of the TopClazz class
    val topClazzResponse = TopClazz.subCall()
    println(topClazzResponse)

}

class TopClazz {
    // You are only allowed one companion object declaration per class
    companion object SubClazz {
        fun subCall(): String = "subclazz call"
    }
}