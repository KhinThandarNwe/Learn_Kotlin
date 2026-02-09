package Kotlin_Basic.Collection

class MapDataType {
    fun run(){
        //Map ကို ဖတ်ချင်ရင် use "value"
        //Map မှာ key က unit ဖြစ်တယ်, key ထပ်လို့မရဘူး
        // add ဆို push
        //entries.forEach
        //Link Hash Map က ထည့် ထားတဲ့ အတိုင်းပေါ်ပေးတယ်
        //hash map က key ကို ascending order အလိုက်စီပေးတယ်
        val m = mapOf("Key One" to "Value 1", "Key Two" to "Value 2", "Key Three" to "Value 3")
        val hm = HashMap<String,String>()
        hm["h"] = "value h"
        hm["i"] = "value i"
        hm["d"] = "value d"
        hm["b"] = "value b"
        hm["p"] = "value p"
        val p = "key one" to "value one"
        println(m["Key Three"])
        hm.forEach {
           println("Key is ${it.key} and value is ${it.value}")
       }
    }
}