package Kotlin_Basic.OOP

class SecondaryConstructor {
    fun run(){
        // init ကို အရင်ခေါ် ပေးတယ်
//        val person = Person("Mg Mg", 29, "Myanmar")
        val person2 = Person("John", 29,)
    }


}
class Person(var name:String,var age:Int,var address:String){
    init {
        println("My name is $name and age is $age and address is $address")
    }
    constructor(name: String,age: Int) : this(name,age,"_") {
        println("Constructor 1 is called")
    }
    constructor(name: String) : this(name,0,"_") {
        println("Constructor 2 is called")
    }
}