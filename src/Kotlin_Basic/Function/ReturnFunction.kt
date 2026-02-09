package Kotlin_Basic.Function

class ReturnFunction {
    fun run(){
//     val cal = calculateNumber()
//        cal(4,6)
        calculateNumber(5)(7)
    }
    fun calculateNumber(num1: Int): (Int) -> Unit{
//        return ::sum
        return   {num2: Int -> println("sum of $num1 and $num2 is ${num1 + num2}") }
    }
    fun sum(num1 : Int, num2 : Int) : Unit{
        println("sum of $num1 and $num2 is ${num1 + num2}")
    }
}