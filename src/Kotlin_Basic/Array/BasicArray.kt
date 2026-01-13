package Kotlin_Basic.Array

class BasicArray {
    fun run(){
//        val a : Array <Int> = arrayOf(1, 2, 3, 4, 5)
//        val s = arrayOf(1, "Khin", "Nwe", 4, "Thandar")
//        val n = arrayOf(arrayOf(1, 2, 3, 4, 5),arrayOf(1, "Khin", "Nwe", 4, "Thandar"))
//        for(i in a)
//        println(i)
//        for(k in n){
//            for (j in k){
//                print(j)
//            }
//            println()
//        }
//        println(s[1])


//        val a = Array(4){"Khin"}
//        for(i in a){
//            println(i)
//        }
        val a = Array(4){i -> i *2}
        for(i in a){
            println(i)
        }

    }
}