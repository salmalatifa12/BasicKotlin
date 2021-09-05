package com.idn.basickotlin.tugas

fun main() {
    sum(8, 7)
    sub(8,7)
    multiplication(8,7)
    division(8,4)
}

fun sum(nilaiA: Int, nilaiB: Int){
    println(nilaiA + nilaiB)
}

fun sub(nilaiA: Int, nilaiB: Int){
    println(nilaiA - nilaiB)
}

fun multiplication(nilaiA: Int, nilaiB: Int){
    println(nilaiA * nilaiB)
}

fun division(nilaiA: Int, nilaiB: Int){
    println(nilaiA / nilaiB)
}