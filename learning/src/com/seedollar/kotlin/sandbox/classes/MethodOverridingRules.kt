package com.seedollar.kotlin.sandbox.classes

fun main(args: Array<String>) {
    val test = ComponentImpl()
    println(test.process())

    println(test.claim())
}

interface Interface {
    // Interface methods are 'open' by default
    fun process():String = "interface processing"
    fun claim() = println("interface claim")
}

open class Component {
    open fun process():String = "component processing"
    open fun claim() = println("component claim")
}

class ComponentImpl(): Component(), Interface {
    override fun process(): String {
        // We need to explicitly declare which parent class process method we want to override
        return super<Interface>.process()
    }

    // The overridden method will call both parent 'claim' methods
    override fun claim() {
        super<Interface>.claim()
        super<Component>.claim()
    }

}