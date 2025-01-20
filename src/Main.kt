fun main()
{
    val morningNotifications = 51
    val eveningNotifications = 135
    var numberOfNotifications = morningNotifications
    for (x in 1..2)
    {
        printNotificationSummary(numberOfNotifications)
        numberOfNotifications = eveningNotifications
    }

}

fun printNotificationSummary(numberOfNotifications: Int)
{
    if(numberOfNotifications < 100 ) println("You have $numberOfNotifications notifications") else println("You have 99+ notifications")

}