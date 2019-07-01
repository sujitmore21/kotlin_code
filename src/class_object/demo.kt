package class_object

fun main(args : Array<String>){

    println("Hello Aliens")

    var tittu = aliens()
   // val tittu = aliens()
    /*
    *
    *
    *
    var is like general variable and it's known as a mutable variable in kotlin and can be assigned multiple times.

    val is like Final variable and it's known as immutable in kotlin and can be initialized only single time.
    *
    *
    *
    */

    tittu.name = "Harsh"

   // println("Name is: "+tittu.name)

    println("Name is: ${tittu.name}")

}