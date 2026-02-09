package Kotlin_Basic.OOP

class StructuralEquality {
    // structural equality (== and !=) equals() in java
    // referential equality (=== and !== ) == in Java
    fun run (){
        val bookOne = Books("The Class")
        bookOne.time = "First"
        val bookTwo = Books("The Class")
        bookTwo.time = "Second"
        var bookThree = bookOne.copy()
        println(bookOne)
        println(bookOne === bookTwo)//Object နှစ်ခု က memory equal ဖြစ်မှ true ဖြစ်တယ်
        println(bookOne === bookThree)
    }
}

data class Books(val title: String){
    var time : String = ""
}