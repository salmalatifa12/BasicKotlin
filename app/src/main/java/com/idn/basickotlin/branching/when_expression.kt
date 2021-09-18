package com.idn.basickotlin.branching

fun main() {
    val nilaiRaport = 80
    when (nilaiRaport){
        in 80..100 -> print("Selamat,nilai mu bagus diatas KKM")
        in 60..80 -> print("Nilai mu sedangan pas KKM")
        in 40..59 -> print("Nilai mu rendah dibawah KKM")
        in 10..39 -> print("Nilai mu sangat rendah dibawah KKM")
        else -> print("wah kasihan gak dapet raport ya")
    }
}