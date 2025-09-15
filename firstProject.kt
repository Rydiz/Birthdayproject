
import java.time.Month
import java.time.LocalDate
import kotlin.math.abs


fun main() {
// Valid months are listed here
    val validMonths = setOf(
        "January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
        "November", "December"
    )
// Function that validates an input against the valid months list
    fun validateMonthInput(name: String): Boolean {
        return name in validMonths

    }

    // User enters their first name
    println("Please enter your first name")
    val firstName = readln().lowercase().capitalize()
    println("\nWelcome $firstName!")


    // User enters their last name
    println("\nWhat is your last name?")
    val lastName = readln().lowercase().capitalize()
    println("\nWelcome $firstName $lastName!")


    // User enters their birth month, which is validated against valid months
    var birthdayMonth: String = ""
        do {
            println("\nWhich month were you born in?")
            birthdayMonth = readln().lowercase().capitalize()
            if (validateMonthInput(birthdayMonth) != true) {
                println("\nThat is not a month!")
            }
        } while (validateMonthInput(birthdayMonth) != true)







    // The month is evaluated and assigned a number between 1-12
    var birthdayNum = when (birthdayMonth) {
        "January" -> 1
        "February" -> 2
        "March" -> 3
        "April" -> 4
        "May" -> 5
        "June" -> 6
        "July" -> 7
        "August" -> 8
        "September" -> 9
        "October" -> 10
        "November" -> 11
        "December" -> 12
        else -> 0
    }




    

    // The season is assigned depending on the month number
    val season = when(birthdayNum) {
        in 1..2 -> "Summer"
        in 3..5 -> "Autumn"
        in 6..8 -> "Winter"
        in 9..11 -> "Spring"
        else -> "Summer"



}   // The current month is assigned and then compared with the birth month
    val currentMonth = ((LocalDate.now().monthValue))

    var monthsAway = birthdayNum - currentMonth
    if(monthsAway < 0) {
        monthsAway = abs(monthsAway + 12)
    }

println("\nHello $firstName $lastName, you were born in $birthdayMonth, which is in $season! ")
    println("Your birthday is only $monthsAway months away!")













}

