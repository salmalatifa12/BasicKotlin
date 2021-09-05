package operasiMatematika

fun main(){
    val sum = 5 + 3
    val sub = 5 - 3
    val div = 9 / 3
    val sisa = 9 % 2
    val kali = 2 * 4

    println(sum)
    println(sub)
    println(div)
    println(sisa)
    println(kali)

    val mix = 10 / 2 + 4 - 2 * 8 * 2
    // -23
    val mix2 = 10 / 2 + (4 - 2) * 8 * 2
    // 37
    println(mix)
    println(mix2)

    val a = sum.toDouble()
    val b = sub.toDouble()
    val c = div.toDouble()
    val d = sisa.toDouble()
    val e = kali.toDouble()

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)

    val mod1 = a % b
    val mod2 = c % d
    val modModan = 10.0 % 3.3
    val modian2 = 1 % 2

    println(mod1)
    println(mod2)
    println(modModan)
    println(modian2)
}