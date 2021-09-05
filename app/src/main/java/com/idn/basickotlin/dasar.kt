package com.idn.basickotlin

fun main() {
    luasPersegiPanjang(6,8)
    luasPersegiPanjang( panjang =  6 ,lebar = 4)
}


fun luasPersegiPanjang (panjang : Int , lebar : Int) {
    val luas = panjang * lebar
    println("Luas Persegi Panjang adalah $luas")

}