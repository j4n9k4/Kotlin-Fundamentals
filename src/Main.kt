fun main()
{
    val child = 5
    val adult = 28
    val senior = 87
    val isMonday = false

    val morningNotifications = 51
    val eveningNotifications = 135
    var numberOfNotifications = morningNotifications
    for (x in 1..2)
    {

        numberOfNotifications = eveningNotifications
    }

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")

}

fun printNotificationSummary(numberOfNotifications: Int)
{
    if(numberOfNotifications < 100 ) println("You have $numberOfNotifications notifications") else println("You have 99+ notifications")

}
fun ticketPrice(age: Int, isMonday: Boolean): Int {

   return when(age)
   {
       in 0..12 -> 15
       in 13..60 -> if (isMonday) 25 else 30
       in 61..100 -> 20
       else -> -1
   }

}