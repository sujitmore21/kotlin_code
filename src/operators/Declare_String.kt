package operators

fun main(args : Array<String>){

    /**
     * These Strings are Immutable which
     * means they are read-only and
     * unchangeable
     */
    val website = "BeginnersBook"

    /**
     * This is how we declare long strings
     */
    val longString = """Welcome to
        Beginnersbook.com"""


    /**
     * Mutable Strings
     */
    var name = "Chaitanya"
    var lName = "Singh"
    name = name + " " + lName
    println("Name is: $name")
}