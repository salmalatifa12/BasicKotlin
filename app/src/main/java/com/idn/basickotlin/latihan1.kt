package com.idn.basickotlin
fun main() {
    println(hitung(42))
}

fun hitung(waktu: Int) : Double{

    var harga = 0.0

    if (waktu in 1..5){
        harga = 1 * waktu.toDouble()
    } else if (waktu in 6..23){
        harga = (5) + (0.5 * (waktu - 5.0))
    } else if (waktu >= 24){
        harga = 15.0 + ((waktu - 24.0) * 0.5)
    }

    return harga
}
