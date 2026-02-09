package Kotlin_Basic.OOP

class Enhancing {
    // @JvmOverloads
    // class ရဲ့ parameter မှာ optional အနေနဲ့ ရေးတဲ့ နေရာမှာ သုံးတယ်
    // @JvmStatic
    //singleleton class ထဲမှာ ရှိ တဲ့ variable ကို ပိုရိုးရှင်းချင်ရင် သုံးတယ်
    // @JvmField
    //interoperability
    //Kotlin <=> Java

    fun run(){

        val student1 = Student("Khin Khin", 27, "Dedaye" )
        val student2 = Student("Khin Khin Khin", 28,)
        ApiServices.getStudents()
        println(student1.studentName)

    }
}
class Student @JvmOverloads constructor ( val name : String, var age : Int, var address : String = "Myanmar"){
    @JvmField
    val studentName : String = "Khin Thandar Nwe"
}

object ApiServices{
    @JvmStatic
    fun getStudents(){
        println("Get Student called")
    }
}