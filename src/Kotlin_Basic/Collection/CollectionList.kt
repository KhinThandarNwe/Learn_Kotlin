package Kotlin_Basic.Collection

class CollectionList {
    fun run(){
        // Collection {List , Set, Map}
        // Set က data မထပ်တာ , Unit ဖြစ်
        // Map က (Key, Value) pair
        // Collection 2မျိုး
        // InMutable list (ပြောင်းစရာ မလို တဲ့ ကိစ္စ တွေကို သုံး
        // Mutable List (Changes List တွေမှာ သုံး)
        // list.indices ( List ရဲ့ rate ကိုထုတ်ပေးတယ်)
        // list.elementAtOrNull (Save operator, run time မှာ error မဖြစ်အောင်သုံးတာ)

        val list = listOf(7,8,3,2,5)
        val list2 = mutableListOf(79,82,36,85)// add, remove, removeAt(0)
        println(list.count { it >5 })
    }
}