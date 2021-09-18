package com.idn.basickotlin.looping

fun main() {
    for (data in 1..5) println("asyeek")
    for (number in 1..10) println("number")
    for (hewan in 1..15) println("hewan")
    for (angka in 1..20) println("angka")

    val nama = "Yusril"
    for (name in nama){
            // argument name berfungsi untuk melakukan  jumlah perulangan (sesuai index / jumlah char)
        println("\"$nama\"")
    }

    val namaku = "Yusril"
    for (namaku in namaku){
            //ini argument dipanggil dari data nya, jadi dia akan melakukan pengulangan indexingnya/charact
        println("\"$namaku\"")
    }
    for (index in 1.rangeTo(5)) {
        println(index)
    }
    // untuk melakukan perulangan dari 10 - 1 dengan step 3 (melewati 3 angka)
    for (bawah in 10.downTo(1) step 3){
        println(bawah)
    }
    //  untuk mencari indexnya
    val rangeku= 1.rangeTo(10)
    rangeku.forEachIndexed { index, value ->
        println("$index berisi $value")
    }
}