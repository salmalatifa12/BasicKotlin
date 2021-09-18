package com.idn.basickotlin.looping

fun main() {
    // syntax untuk break (menghentikan seluruh perulangan) untuk memberhentikan while
    var i = 0
     while (true) {
        println("berhenti dong :) $i")
        i++ // ditambah 1 perulangan lagi
        if (i > 20) {
            break
        }
    }
}
/*
syntax untuk continue (menghentikan perulangan yg berjalan, langsung melanjutkan ke perulangan)
selanjutnya */



