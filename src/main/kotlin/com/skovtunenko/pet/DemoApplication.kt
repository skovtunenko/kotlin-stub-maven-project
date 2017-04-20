package com.skovtunenko.pet

import com.skovtunenko.pet.annotations.AllOpenWithNoArgConstructor

/**
 * Main entrance
 */
fun main(args: Array<String>) {
    println("Hello world!")
}

@AllOpenWithNoArgConstructor
class MyClass(val readOnlyProperty: String)
