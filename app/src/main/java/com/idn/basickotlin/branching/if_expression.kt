package com.idn.basickotlin.branching

fun main() {
    val a = 8
    val b = 19
    var max: Int? = null
    var min: Int? = null

    if (a < b) max = a
    println(max)

    max = if (a > b) a else b
    min = if (a < b) a else b
    println(max)
    println(min)
}