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

    if (age <= 12) {
        return 15

    }
    else if (age in 13..60) {

        return if (isMonday) {
            25
        } else {
            30
        }

    }
    else if (age in 61..100) {
        return 20
    }
    else
    {
        return -1
    }

}