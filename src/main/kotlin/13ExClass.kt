fun main(args: Array<String>) {
    println("Please enter the current year")
    val input = readLine()?:"0"
    val year = input.toInt()
    val ordinaryYear = linkedMapOf(Pair("January", 31), Pair("February", 28), Pair("March", 31),
        Pair("April", 31), Pair("May", 31), Pair("June", 30), Pair("Jule", 31), Pair("August", 31),
        Pair("September", 30), Pair("October", 31), Pair("November", 30), Pair("December", 31))
    var leapYear = LinkedHashMap(ordinaryYear)
         leapYear["February"] = 29

        if(year % 4 == 0) {
            println("You enter $year. This is a leap year. Months in this year has next days:")
            for (month in leapYear.keys) {
                var days = leapYear[month]
                println("$month: $days.")
            }

        }
        else {
            println("You enter $year. This is an ordinary year. Months in this year has next days:")
            for (month in ordinaryYear.keys) {
                var days = ordinaryYear[month]
                println("$month: $days.")
            }
        }








}

