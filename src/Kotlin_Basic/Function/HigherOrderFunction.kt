package Kotlin_Basic.Function

class HigherOrderFunction {
    //first class citizen support ပေးတယ် (fun တွေ ကို variable ထဲ ထည့်လိုံရတယ်)
    //function တစ်ခုမှာ အခြား function က paremeter လည်းဖြစ်လ်ု့ရတယ်,return type လည်းဖြစ်လ်ု့ရတယ်
    //2 type of function(Higher Order Function, Lambda function )

    fun run(){
        squre(10,{println(it)},{println(it)})

        squares(10,::output)
          onClickListener { println("clicked") }

    }
    fun squre (num: Int,result:(Int)-> Unit, origin : (Int) -> Unit){
        result (num +num)
        origin(num)
    }
    fun squares (num: Int, result:(Int, Int)-> Unit){
        result(num,num*num)
    }
    fun output (original : Int, square : Int){
        println("The square of $original = $square")
    }
    fun onClickListener(onClick : ()->Unit){
        onClick()
    }
}