package Kotlin_Basic.Collection

class ListAdvancedFun {
    fun run(){
        //Searching (contain, indexOf, find, findLast)
        //Filtering (filter, map)
        //Sorting (desc, as
        //Checking (Array ထဲမျာ ဘာတွေပါလဲ , ၀ နဲ့ ညီမ ညီလည်းစစ်ရတယ်) [any,
        val list = listOf(7,8,3,2,5)
        val mulList = mutableListOf(3,5,8)
        val fruit = listOf("apple","banana", "kiwi")
        println(list.count { it > 5 })
        println(list.indexOf (8))
        println(list.filter { it % 2 == 0 })
        println(list.map{it *2})
        println(list.sorted())
        println(list.sortedDescending())
        println(fruit.sortedBy { it.length })
        println(fruit.sortedByDescending { it.length })
        println(list.any { it % 2 == 0 })
        println(fruit.any { it.startsWith("k") })
    }
}