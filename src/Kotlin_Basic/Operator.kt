package Kotlin_Basic

class Operator {
    fun run() {
        //plus (+)
        //minus (-)
        //times (*)
        //divide (/)
        //remainer
        var a = 10
        var b = 20
        val c = b.minus(a)
        val d = c.times(b)
        val e = c.div(b)
        val  f = c / b.toDouble()
        val g = b.rem(a)
        a = 7 +5
        // Assignment operator
        // = & ==
        //+=
        //-=
        // ++ & --
        //++a ,a++(++a +ပြီးမှ print ပေးတယ်, a++ print ပြီးမှ + ပေးတယ်)
        // inc()
        // dec()

        println("$a \n $b \n $c \n $d \n $e \n $f \n $g")

    }
}