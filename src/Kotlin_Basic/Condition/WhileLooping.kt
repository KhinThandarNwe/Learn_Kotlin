package Kotlin_Basic.Condition

import java.util.Scanner

class WhileLooping {
    fun run(){
      val scanner = Scanner(System.`in`)
        var password = ""
        while (!password.equals("12345678")) {
            println("Please enter password")
            password = scanner.nextLine()

        }
        println("You can access now")
    }
}