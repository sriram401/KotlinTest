/**
 * Created by Sriram on 1/6/2017.
 */


fun main(args : Array<String>)
{
    println("Hello World!")
    loopTest(5)
    val p1 = Person("Sriram")
    println("Person One name : " + p1.name)
}

fun loopTest(a : Int)
{
    for (i: Int in 1..a)
    {
        println("Loop : " + i)
    }
}

class Person(val name: String)
