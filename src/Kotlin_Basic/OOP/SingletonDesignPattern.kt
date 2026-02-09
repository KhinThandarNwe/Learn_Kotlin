package Kotlin_Basic.OOP

class SingletonDesignPattern {
    //Object ကို ခဏခဏ မဆောက်ချင်ဘူး(Such as API call, database object,)
    //Application တစ်ခုမှာ Object တစ်ခါ ပဲဆောက်ချင်ရင် singleton design pattern ကို သုံးတယ်
    //class ကို တိုက်ရိုက်ခါ့်လို့ မရဘူး class ထဲက method ကို ခေါ်သုံးရတယ်

    fun run(){
        val apiService = ApiService.getInstance()
        val apiService1 = ApiService.getInstance()
        val apiService2 = ApiService.getInstance()

        val apiServiceKotlin = ApiServiceKotlin
         apiServiceKotlin.a ="B"
        val apiServiceKotlin1 = ApiServiceKotlin
        val apiServiceKotlin2 = ApiServiceKotlin

        println(apiService.hashCode())
        println(apiService1.hashCode())
        println(apiService2.hashCode())

        println(apiServiceKotlin.a)
        println(apiServiceKotlin1.a)
        println(apiServiceKotlin2.a)
    }
}
// for jave, dart
class ApiService private constructor(){
    companion object{
       private var instance : ApiService? = null
               fun getInstance(): ApiService {
                   if (instance == null){
                       instance = ApiService()
                   }
                   return instance as ApiService
               }

    }
}
// for kotlin
object ApiServiceKotlin {
    // java တို့ kotlin တို့က multi thread အလုပ်လုပ်လို့ Thread management လုပ်ပေးရတယ်
    // dart က single thread အလုပ်လုပ်တယ်

    var a = "A"
    @Synchronized
    fun printA() = println(a)

}