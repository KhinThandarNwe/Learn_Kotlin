package Kotlin_Basic

class RelationalOperator {
    fun run() {
        //Relational Operator , Unary Operator, Bitwise
        // bool (true, false)
        // equal == (===)
        //less
        //greater
        //not equal

        val s = "hello word"
        //2^3 2^2 2^1 2^0
        //     16 8 4 2 1
        // 2=         1 0
        // 6=     1 1 1 1
        val a = 2
        val b =15

        println(s.length != 11)
        println(a.toString( 2))
        println(b.toString( 2))
        println(a or b)
        println(a and b)
    }
}