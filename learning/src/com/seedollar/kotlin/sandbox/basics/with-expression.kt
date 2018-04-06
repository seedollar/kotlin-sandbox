package com.seedollar.kotlin.sandbox.basics

fun main(args: Array<String>) {

    val sim1 = Simulation()

    with (sim1) {
        start()
        initialize()
        shutdown()
        end()
    }

}

class Simulation {
    fun start() = println("Started...")
    fun initialize() = println("Initialize...")
    fun shutdown() = println("Shutdown...")
    fun end() = println("End.")
}