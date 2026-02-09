package Kotlin_Basic.OOP

class Inheritance {

    //inheritance
    //open & final
    fun run(){
        val actor = Art("Mandalay")
        println(actor.name)
        println(actor.age)
        println(actor.eat())
        println(actor.sleep())
    }
}
// class တစ်ခု ကို တစ်ခြား class တစ်ခု က extern လုပ်ချင်ရင် open key word ကို သုံးရတယ်
// java နဲ့ kotlin က ဆန့်ကျင်ဘက် java မှာ extern လုပ်ခွင့် မပေးချင်ရင် final ကို သုံး ရတယ်
open class Actor(open var address : String){
    open var name : String = "Hnin Hnin"
    var age : Int = 27
    fun eat(){
        println("$name is eating $age years old")
    }
    fun sleep(){
        println("$name is sleeping $age years old")
    }
}
class Art(override var address: String) : Actor(address){
    override var name : String = "Moe Myint"
    fun Action(){
        println("$name is Action")
    }
}