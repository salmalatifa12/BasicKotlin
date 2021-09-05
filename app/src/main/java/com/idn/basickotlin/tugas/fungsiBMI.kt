package com.idn.basickotlin.tugas

fun main() {
    var beratbadan = 65
    var tinggibadan = 170

    // cara menghitung BMI adalah kg / m*m
    var bmi = beratbadan.toDouble() / tinggibadan / tinggibadan * 10000
    print(bmi)
}