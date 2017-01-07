/**
 * Created by Sriram on 1/6/2017.
 */


fun main(args : Array<String>)
{
    println("Hello World!")
    loopTest(5)
    val p1 = Person("Sriram")
    println("Person One name : " + p1.name)

    val l1 = listOf<String>("testListItem1","testListItem2")
    println("List Items : " +l1)
    println("java class for list : " + l1.javaClass)

    val s1 = setOf<String>("testSetItem1","testSetItem2")
    println("Sett Items : " +s1)
    println("java class for set : " + s1.javaClass)

    val m1 = mapOf<String,String>("k1" to "v1", "k2" to "v2")
    println("Map Items : " + m1)
    println("java class for map : " + m1.javaClass)

}

fun loopTest(a : Int)
{
    for (i: Int in 1..a)
    {
        println("Loop : " + i)
    }
}

class Person(val name: String)
