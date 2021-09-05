fun main(){
    var kosong : String? = null
    val kosongan : Int? = null
    val kekosongan : Array<String>? = null

    kosong = "Yoenas"

    val name : String? = null
    if (name != null){
        println(name.length)
    } else{
        println("No name")
    }
    println(name?.length)
    println(name?.length ?: "Yusril")
}