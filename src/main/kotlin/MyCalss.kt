@file:Suppress("NAME_SHADOWING")

fun main() {
//მივესალმე მომხამრებელს.
    println("Hello ! ")
//შემოვიტანე ჩემი ფუნქცია.
    Sum()

    println()
//    ფუნქციის აღსრულების მერე გამოვტოვე ადგილი და მომხარებელს შევთავაზე არჩევანი კი ან არა.
    val answer:String = readLine()!!
    println()
//    ვაილ ცილკლში გავატარე touppercase მინდოდა რო გამომეყენებინა და დამემოკლებინა , ამაზე გავჩერდი
    while (answer == "y" || answer == "Y")
    {
//        თუ კი პასუხი აირჩია მომხმარებელმა ფუქნცია გაეშვება თავიდან
        println("${Sum()}")
//        ყველაზე თავარი აქ ხდება, ვიცი არ მუშაობს სწორად მაგრამ კის შემთხვევაში რამდენჯერაც კის დავაჭერ ფუნქციის აღსრულების მერე შემომთავაზოს ხელახლა დაწყება
        val answer:String = readLine()!!

    }
//    არას შემთხვევაში მორჩა თამაში
    if (answer == "n" || answer == "N")
    {
        println("Finish  :)")
    }
}
//ამ ფუნქციაში ხდება რიცხვების შეტანა და დაანგარიშება.
fun Sum()
{

    print("Please assign a value for X: ")
    val numberX = readLine()!!
    print("Please assign a value for Y: ")
    val numberY = readLine()!!
    val numberZ = numberX.toInt() + numberY.toInt()
    println("The Sum is: $numberZ")
    print("Do u want to restart ? :) Y/N")
}