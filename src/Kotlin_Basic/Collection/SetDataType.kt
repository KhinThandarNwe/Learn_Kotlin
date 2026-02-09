package Kotlin_Basic.Collection

class SetDataType {
    fun run(){

//    List မှာ သုံးလို့ရတာမှန်သမျှ set မျာ သုံးရတယ်
        val l = setOf(1,2,3,4,1,2,3,4,6,8,9,4,5)// data ထပ်ထည့်တာတွေသုံးမရတော့ဘူး, multableSet ကိုသုံးပေးရတယ်
        var multSet = mutableSetOf(1,2,3,4,1,2,3,4,6,8,9,4,5)
        val s = setOf(1,2,3,4,1,2,3,4)
        var e = l.toList()
        multSet.add(6)
        multSet.add(15)
        multSet.remove(1)
        for (n in l) {
            println(n)
            println(multSet)
        }
    }

}