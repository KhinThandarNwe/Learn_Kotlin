package Kotlin_Basic.Function

class LexicalScopAndClosure {
    fun run() {
        //Lexical Scope
        //အပြင်မှာ ရှိတဲ့ variable ကို fun ထဲမှာ ပြောင်းလို့ရတယ်
        //Outer function ကို ခေါ်ချင်ရင် closer ကိုသုံးလို့ရတယ်
  val s = sum(5)
        println(s(7))
        val o = outerFunction()
        println(o(1))

    }
    fun outerFunction() : (Int)-> String {
        val s = "Khin Khin"
        fun interFunction(num : Int) :String {
            return "$num $s"
        }
        return ::interFunction
    }

    fun sum (num1 : Int) : (Int) -> Int{
         return fun (num2 : Int) : Int{
            return num1 + num2
        }
    }

}