package Kotlin_Basic.Condition

import java.util.Scanner

class When_Statement {
    fun run(){
        println("Please enter a number")
        val scanner = Scanner(System.`in`)
        val inputNumber = scanner.nextInt()

        when(inputNumber){
            1 -> println("The number is one")
            2 -> println("The number is two")
            3 -> println("The number is three")
            10 -> println("The number is ten")
            else -> println("None of the above")
        }
        //Dart is => , Kotlin is ->
       val stringNumber = when(inputNumber){
            1 -> ("The number is one")
           2 -> ("The number is two")
           3 -> ("The number is three")
           10 -> ("The number is ten")
           else -> println("None of the above")
           }

           println("String version = $stringNumber")

    }
}