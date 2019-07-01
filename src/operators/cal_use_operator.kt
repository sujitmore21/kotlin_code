package operators

import class_object.aliens

fun main(args: Array<String>)
{
    var num1 : Int = 4
    var num2 : Int = 7

    var result = num1+num2
    //println(result)

    println("The addition of $num1 and $num2 is $result")

    var sujit = aliens()
    sujit.name = "more"

    println("Alien name is : ${sujit.name}")
}