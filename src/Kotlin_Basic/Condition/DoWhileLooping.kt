package Kotlin_Basic.Condition

import java.util.Scanner

class DoWhileLooping {
    fun run(){
        var i = 0
        var j = 10
        val scanner = Scanner(System.`in`)
        while (i >10){
            println("Hello World")
            i++
        }
        do {
            if (i>9) {
                println("Please enter a number less than 10")
                i = scanner.nextInt()
            }
            println("Hello World $i")
            i++
        }while (scanner.hasNextInt())
    }
}