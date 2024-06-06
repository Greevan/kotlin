import org.jetbrains.annotations.TestOnly

fun main() {
//    //1
//    val cs = ConditionalStatements()
//    cs.conditionalStatements()

//    //2
//    LittleLemonCafeteria().weekdayTiming()

    //3
    LittleLemonHourCheck().openOrclose()


}

class LittleLemonHourCheck {
    fun openOrclose() {
            val weekday = "Monday"
            val time = 25
            val shopcondition:Boolean = when {
                weekday == "Monday" && 8<=time && time<=24 -> true
                weekday == "Tuesday" && 8<=time && time<=18 -> true
                weekday == "Wednesday"&& 8<=time && time<=18 -> true
                weekday == "Thursday" && 8<=time && time<=18 -> true
                weekday == "Friday" && 8<=time && time<=21 -> true
                weekday == "Saturday" &&8<=time && time<=16 ->true
                weekday == "Sunday" && 8<=time && time<=16 ->true
                else -> false
            }
            if(shopcondition){
                print("Little Lemon is open now")
            }else print("Little Lemon is closed now")
    }

}

class LittleLemonCafeteria {
    fun weekdayTiming() {
        val weekday = "Monday"
        val day = when (weekday) {
            "Monday" -> "Opens 8am to 12pm"
            "Tuesday" -> "Opens 8am to 6pm"
            "Wednesday" -> "Opens 8am to 6pm"
            "Thursday" -> "Opens 8am to 6pm"
            "Friday" -> "Opens 8am to 9pm"
            "Saturday" -> "Opens 9am to 4pm"
            "Sunday" -> "Opens 8am to 4pm"
            else -> "ERROR"
        }
        println(day)
    }
}

class ConditionalStatements {
    fun conditionalStatements() {
        val password = "ABC"
        val result: String = if (password.length < 7) "Less Size" else "Password not Properly set"
        fun printResult() {
            println(result)
        }
        printResult()
    }
}