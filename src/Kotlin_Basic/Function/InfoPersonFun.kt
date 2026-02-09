package Kotlin_Basic.Function

class InfoPersonFun {
    fun run(){
val info =infoPerson(name ="Khin Khin", address = "No.33, YandanarTheinKha Str, SaungChaung Tws, Yangon")
        println(info)
    }
    fun infoPerson(name: String? = null, age: Int? = null, address: String? = null): String {
        var info = ""
        if(name!=null){
            info = "Name - $name"
        }
        if(age!=null){
            info = "$info Age - $age"
        }
        if(address!=null){
            info = "$info Address - $address"
        }
        return info
    }
    fun evenOrOdd(number : Int) : String = if(number % 2 == 0)  "Even" else "Odd"

}