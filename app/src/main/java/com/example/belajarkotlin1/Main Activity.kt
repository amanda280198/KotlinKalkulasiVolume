package com.example.belajarkotlin1

fun main() {
    var namaVar : String = "manda" //mootable
     val namaVal : String = "andi" //variabel yg di lock (remootable)

    val helloVal = 50
    var helloVar = 19

hello()

    getData(namaVal, helloVal)
    getArray()
    decision(helloVar, helloVal)
    sum(helloVar, helloVal)
}

fun hello () {
    println ("hello \"Kotlin\"")
}

fun getData(name : String, umur : Int) {
    println("Hello nama saya $name, umur saya $umur")
}

fun getArray () {
    val intArray = intArrayOf(1,3,4,5,7)
    println (intArray[4])
}

fun decision(umur: Int, paramUmur : Int) {
    val status : String
    if (umur < paramUmur ) {
        status = "umur andi muda"
    } else  {
        status = "umur andi tua"
    }
    println(status)
}

fun sum (angka1 : Int, angka2 : Int) {
    println(angka1 + angka2)

}