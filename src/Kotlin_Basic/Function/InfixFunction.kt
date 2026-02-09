package Kotlin_Basic.Function

class InfixFunction {
    // Extension Fun ရဲ့ parameter တစ်ခုပဲ ပါတဲ့ function မှာ infix function ကို သုံးတယ်
    fun run (){
        println(5.greaterThan(4))
        println(5 greaterThan 4)
        println("My name is Mg Mg" compareLength "My name is Maug Maung")

    }
   infix fun Int.greaterThan(other: Int): Boolean{
        return this >other
    }
    infix fun String.compareLength(other: String): String{
        if(this.length > other.length){
            return this
        }else
        return other
    }
}