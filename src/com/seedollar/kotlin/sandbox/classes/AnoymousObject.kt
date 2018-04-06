package com.seedollar.kotlin.sandbox.classes


fun main(args: Array<String>) {
    val anonymousObject = object {
        var index: String = ""
        val activeFlag : Boolean = false
    }

    anonymousObject.index = "testIndex"

    println("anonymous object with index: '${anonymousObject.index}' has active status: ${anonymousObject.activeFlag}")
}