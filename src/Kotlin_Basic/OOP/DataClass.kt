package Kotlin_Basic.OOP

class DataClass {

 // data class
//(equal, readable-string ,destruction, copy) <= USE FOR
// to String, hash code, componentN, equal <= auto generate
//(POJO) plain old java object
//freezed (dart)

 fun run(){
     val note1 = Note("Title One","Description")
     val note2 = Note("Title Two","Description")
    val (t,d) = note2
     val note3 = note1.copy("Title","Description Data")

     val bookOne = Book("The Class")
     bookOne.time = "First"
     val bookTwo = Book("The Class")
     bookTwo.time = "Second"
     println(bookOne)
     println(bookOne == bookTwo)
 }
}
// class ရှေ့ မှာ data ရေးတာနဲ့ auto generate လုပ်ပေးတယ်
data class Note(val title: String, var desc: String)

//class ရဲ့ data နှစ်ခုထဲ က တစ်ခုကို ပဲစစ်ချင်ရင် စစ်မဲ့ data ကို parameter အဖြစ်ထားခဲ့
data class Book(val title: String){
    var time : String = ""
}