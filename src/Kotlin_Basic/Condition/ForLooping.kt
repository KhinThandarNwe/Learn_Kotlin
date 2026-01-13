package Kotlin_Basic.Condition

class ForLooping {
    fun run(){
        for(i in 1 until 100 step 2){
            print("i is $i ")
        }
        for(j in 100 downTo 1 step 2){
            println("j is $j ")
        }
        val numList = arrayOf(1,2,5,8,9)
        for(k in numList){
            println("$k ")
        }

    }
}