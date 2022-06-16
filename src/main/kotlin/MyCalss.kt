
fun main() {

    Sum()

    println()
    val answer:String = readLine()!!
    println()
    while (answer == "y" || answer == "Y")
    {
        println("${Sum()}")
//        println()

    }
    if (answer == "n" || answer == "N")

    {
        println("დასასრული")
    }
}

fun Sum()
{
    print("Please assign a value for X: ")
    val numberX = readLine()!!
    print("Please assign a value for Y: ")
    val numberY = readLine()!!
    val numberZ = numberX.toInt() + numberY.toInt()
    println("The Sum is: $numberZ")
    print("Gsurt programsis xelaxla dawyeba?: Daweret Y/N")
}