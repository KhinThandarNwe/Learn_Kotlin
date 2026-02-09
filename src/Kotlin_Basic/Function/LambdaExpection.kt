package Kotlin_Basic.Function

class LambdaExpection {
    //name less fun
    //Lambda fun
    //Annoymous fun
    // difference between lambda and annoymous
    //lambda ရဲ့ နောက်ဆုံးက return ပြန်တာ,
    //lambda fun မှာ return ပြန်ရင် ကျန်တာတွေဆက်မလုပ်တော့ဘူး
    //annoymous return type ကိုသတ်မှတ်လို့ရတယါ
    //annoymous fun return ပြန်ရင် ကျန်တာတွေဆက်လုပ်တယ်
    fun run(){
       val s = {num1 : Int, num2 : Int-> println("$num1 + $num2 = ${num1 * num2}")}
        s.invoke(8,5)
        val result =  {num: Int -> println(num)}
        square(4, result)

        val s1 = {num: Int, result : (Int) -> Unit ->
            result (num * num)
        }//lambda
        val s2 = fun (num : Int, result : (Int) -> Unit ) {
            result (num * num)
        }//annoymous
        s1(10){
            println(it)
        }
        s2(8){
            println(it)
        }
    }
    fun square(num: Int, result: (Int) -> Unit) {
        result(num * num)
    }
}