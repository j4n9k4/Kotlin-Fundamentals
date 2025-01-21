
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


open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}
class FoldablePhone(var isFolded: Boolean = false):Phone()

{
    override fun switchOn()
    {
        if (isFolded) super.switchOn() else println("Can't turn on the screen in the folded state ")
    }
    fun fold()
    {
        isFolded = !isFolded
    }
}

class Person(private val name: String, private val age: Int, private val hobby: String?, private val referrer: Person?)
{
    fun showProfile()
    {
        println("Name: $name")
        println("Age: $age")
        if (hobby != null) print("Likes to $hobby. ") else print("Don't have a hobby. ")
        if (referrer != null)
        {
            print("Has a referrer named ${referrer.name}, who likes to ${referrer.hobby}.")
        }
        else
        {
            println("Doesn't have a referrer.")
        }
    }
}
class Bid(val amount: Int, val bidder: String)

fun auctionPrice(bid: Bid?, minimumPrince: Int): Int
{
    return bid?.amount ?: minimumPrince
}
fun main()
{
    val winningBid = Bid(5000, "Private Collector")

    println("Item A is sold at ${auctionPrice(winningBid, 2000)}.")
    println("Item B is sold at ${auctionPrice(null, 3000)}.")


    val amanda = Person("Amanda", 33, "play tennis", null)
    val alex = Person("Alex", 28, "climb", amanda)
    val phone = FoldablePhone()
    phone.switchOn()

    amanda.showProfile()
    alex.showProfile()


    val newSong = Song(title = "Song", artist = "Song Writer", publishedYear = "2000", playCount = 2000)

    newSong.printDescription()
    println(newSong.isPopular)

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