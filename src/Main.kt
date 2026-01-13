import Kotlin_Basic.Array.BasicArray
import Kotlin_Basic.Array.FunctionalArray
import Kotlin_Basic.Condition.DoWhileLooping
import Kotlin_Basic.Condition.ForLooping
import Kotlin_Basic.Condition.When_Statement
import Kotlin_Basic.Condition.If_Statement
import Kotlin_Basic.Condition.LoopControlStatement
import Kotlin_Basic.Condition.WhileLooping
import Kotlin_Basic.DataType
import Kotlin_Basic.Operator
import Kotlin_Basic.RelationalOperator

fun main() {
    val dataType = DataType()   // Object create
    val operator = Operator()
    val relationalOperator = RelationalOperator()
    val ifStatement = If_Statement()
    val whenStatement = When_Statement()
    val forLooping = ForLooping()
    val whileLooping = WhileLooping()
    val doWhileLooping = DoWhileLooping()
    val loopControl = LoopControlStatement()
    val basicArray = BasicArray()
    val functionalArray = FunctionalArray()

    functionalArray.run()
}