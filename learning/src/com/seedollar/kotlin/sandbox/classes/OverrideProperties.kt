package com.seedollar.kotlin.sandbox.classes

fun main(args: Array<String>) {

    val smallBox = SmallBox()
    println(smallBox.toString())

    val largeBox = LargeBox()
    println(largeBox)

    val mediumBox = MediumBox()
    println(mediumBox)

    val box = SmallBox()
    val defaultBox: DefaultBox = box as DefaultBox
    println(defaultBox)
}

open class DefaultBox {
    val length: Double = 20.5
    val width: Double = 7.2
    val height: Double = 3.8
    // We have to use the 'open' keyword to allow the color and cost properties to be overridden by subclasses
    open val color: String = "brown"
    open var cost: Double = 2.0

    override fun toString(): String {
        return "${this.javaClass.simpleName} Length: $length, Width: $width, Color: $color, Cost: $cost, Volume: ${calculateVolume()}"
    }

    fun calculateVolume(): Double = length * width * height
}

class SmallBox: DefaultBox() {
    // We can override the 'val' with a var, but not vice-versa
    override var color: String
        get() = "red"
        set(value) {}
    // We can't do this below because parent scope is 'var' for cost
    //override val cost: Double = 1.0
}

class LargeBox: DefaultBox() {
    override var color: String
        get() = "blue"
        set(value) {}

    override var cost: Double = 4.0
}

// You can also override properties in the primary constructor
class MediumBox(override val color: String = "green") : DefaultBox()