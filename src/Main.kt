class Song(title: String, artist: String, publishedYear: String, playCount: Int)
{
    val title: String = title
    val artist: String = artist
    val publishedYear: String = publishedYear
    val playCount: Int = playCount

    val isPopular = if(playCount > 1000) "Popular" else "Unpopular"

    fun printDescription()
    {
        println("$title, performed by $artist, was released in $publishedYear.")
    }

}
fun main()
{
    val newSong = Song(title = "Song", artist = "Song Writer", publishedYear = "2000", playCount = 2000)

    newSong.printDescription()
    println(newSong.isPopular)
    /*
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

    */
/*
    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
*/
    printFinalTemperature(initialMeasurement = 27.0, initialUnit = "Celsius", finalUnit = "Fahrenheit"){ 9.0/5.0 * it + 32.0}
    printFinalTemperature(initialMeasurement = 350.0, initialUnit = "Kelvin", finalUnit = "Celsius"){it - 273.15}
    printFinalTemperature(initialMeasurement = 10.0, initialUnit = "Fahrenheit", finalUnit = "Kelvin"){ 5.0/9.0 *(it - 32.0) + 273.15}

}

fun printNotificationSummary(numberOfNotifications: Int)
{
    if(numberOfNotifications < 100 ) println("You have $numberOfNotifications notifications") else println("You have 99+ notifications")

}
fun ticketPrice(age: Int, isMonday: Boolean): Int {

   return when(age) {
       in 0..12 -> 15
       in 13..60 -> if (isMonday) 25 else 30
       in 61..100 -> 20
       else -> -1
   }
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> (Double)
)

{
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement))
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}