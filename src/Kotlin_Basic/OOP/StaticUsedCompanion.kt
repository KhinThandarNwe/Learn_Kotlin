package Kotlin_Basic.OOP

class StaticUsedCompanion {
    fun run(){
        val data = Data("John", 29, "Thiecharnaingngan");
      println(Data.key) // class ကို တိုက်ရိုက်ခေါ်သုံးလို့ရတယ်
        data.doSomething()
    }

}
class Data(val name:String,var age:Int,var address:String){
    companion object{
        var key = "kuu123"
        val id = "000783"
    }// Static method
    fun doSomething(){
        println(Data.id)
    }
    //Static method က တစ်ခြား val ကို ခေါ် သုံးလို့ မရဘူး
    //simple method က  companion object or static method ထဲ က data ကို ခေါ် လို့ ရတယ်

}