package Kotlin_Basic.Function

class Function {
    // Top Level function (do not independent)
    // method
    //functional programming
    //default argument, return type, one statement return
    fun run() {
        square(10)
        println(sum(5,9))
         val result = sum (5)
        println("The result is $result")
    }

    fun square(num: Int) {
        println("The square of num is ${num * num}")
    }

    fun sum(num1: Int, num2: Int = 0): Int {
        return num1 + num2
    }

}