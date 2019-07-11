package operators

fun main(args : Array<String>){

    var str1 = "BeginnersBook"
    var str2 = "beginnersbook"

    /**
     * true if equals, otherwise false
     */
    println("String Equals? : ${str1.equals(str2)}")

    /**
     * 0 if equals, otherwise false
     */
    println("String Equals? : ${str1.compareTo(str2)}")
}