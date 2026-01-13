package Kotlin_Basic.Condition

import java.util.Scanner

class If_Statement {
    fun run() {
        val scanner = Scanner(System.`in`)
        val inputNumber = scanner.nextInt()
//        if(inputNumber >0) {
//            println("The number $inputNumber is positive")
//        }else if(inputNumber < 0) {
//            println("The number $inputNumber is negative")
//        }else if(inputNumber ===0){
//            println("The number $inputNumber is zero")
//        }else{
//            println("The number $inputNumber is greater than zero")
//        }
        val evenOrOdd = if(inputNumber % 2 == 0) "Even" else "Odd"
        println("The number $inputNumber is $evenOrOdd")

    }
}