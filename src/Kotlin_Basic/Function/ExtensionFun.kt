package Kotlin_Basic.Function

class ExtensionFun {
    //class တွေထဲမှာ method အသစ်တိုးချင်ရင် သုံးလို့ရတယ်

    fun run(){
        val a : Int = 6
        println(a.isEven())
        println(11.isEven())

        val s : String = "Hello Kotlin"
        println(s.removeSpace())

    }
    fun Int.isEven() = this % 2 == 0
    fun String.removeSpace() : String {
        return this.replace(" ","")
    }
}