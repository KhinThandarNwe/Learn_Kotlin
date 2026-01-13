package Kotlin_Basic.Array

class FunctionalArray {
    fun run(){
        //list(arrayList),
        // set က array ထဲက data က ထပ်လို့ မရဘူး
        // map က key , value သိမ်းတယ်
        val aryOne = arrayOf(1,2,2)
        val aryTwo = arrayOf(1,2,3)
//        println(aryOne.contentEquals(aryTwo))
//
//        val aryOne1 = arrayOf(arrayOf(1,2,2), arrayOf(3,4,5))
//        val aryTwo2 = arrayOf(arrayOf(1,2,2), arrayOf(3,4,5))
//        println(aryOne1.contentDeepEquals(aryTwo2))
        val aryThree = aryOne + aryTwo
        //aryThree.shuffle (တစ်ခါ run ရင် တစ်မျိုးထွက်တယ်, data ကိုပြန်ရောချင်တဲ့ အခါသုံးလို့ရတယ်
        aryThree.sort()
        for (i in aryThree){
            println(i)
        }

        val a = emptyArray<Int>() // null value ရှ်တဲ့ array တစ်ခု return ပြန်တဲ့ အခါမှာ သုံးတယ်
        val b = arrayOfNulls<Int>(5) // index 5 ခု ရှိတဲ့ array 1ခု

    }

}