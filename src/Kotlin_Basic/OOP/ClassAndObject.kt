package Kotlin_Basic.OOP


//Object-oriented programming (OOP)
//class and object
//constructure(primary constructor) (secondary constructors)
//static (companion)
//singleton class (object)
class ClassAndObject {
    fun run(){
        //two type of class (simple class,open class)
        //class ကို extern လုပ်ချင်ရင် inherence ခွင့်ပြူချင်ရင် class ရှေ့မှာ open ကိုသုံး
        val person = Person("Main",29,"Thiecharnaingngan")
        person.name = "Ko Ko"
//       person.showInfo()
    }
    class Person(var name :String, var age :Int,var address:String) {
//        var name : String = "Mg Mg"
//        var age : Int = 27
//        var address: String = "Myanmar"
        init {
            showInfo()
        }
       private fun showInfo(){
            println("My name is $name ,$age years old and address is $address")
        }
    }
}

