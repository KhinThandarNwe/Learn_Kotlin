package Kotlin_Basic.Condition

class LoopControlStatement {
    fun run(){
    //break continue
        for (i in 1..20) {
            print("i is $i ")
            if(i == 5){
                break
            }
        }
       outerloop@ for (j in 1..10) {
            for(k in 1..6) {

//                if(j == 3){
//                    break@outerloop
//                }
                if( j % 2 == 0){
                    continue@outerloop
                }
                println("j is $j and k is $k ")
            }
        }
    }
}