fun main(args: Array<String>) {
    println("Please enter the current year")
    val input = readLine()?:"0"
    val year = input.toInt()

    for(i in 1..12){
        val message = when(i) {
            1 -> "January has 31 days"
            2 -> if (year % 4 == 0) "February has 29 days" else "February has 28 days"
            3 -> "March has 31 days"
            4 -> "April has 30 days"
            5 -> "May has 31 days"
            6 -> "June has 30 days"
            7 -> "Jule has 31 days"
            8 -> "August has 31 days"
            9 -> "September has 30 days"
            10 -> "October has 31 days"
            11 -> "November has 30 days"
            12 -> "December has 31 days"
            else -> "you put the wrong number"
        }
        println(message)
    }
//    println("Please enter the current year")
//    val input = readLine()?:"0"
//    val year = input.toInt()
//    val ordinaryYear = linkedMapOf(Pair("January", 31), Pair("February", 28), Pair("March", 31),
//        Pair("April", 31), Pair("May", 31), Pair("June", 30), Pair("Jule", 31), Pair("August", 31),
//        Pair("September", 30), Pair("October", 31), Pair("November", 30), Pair("December", 31))
//    var leapYear = LinkedHashMap(ordinaryYear)
//         leapYear["February"] = 29555
//
//        if(year % 4 == 0) {
//            println("You enter $year. This is a leap year. Months in this year has next days:")
//            for (month in leapYear.keys) {
//                var days = leapYear[month]
//                println("$month: $days.")
//            }
//
//        }
//        else {
//            println("You enter $year. This is an ordinary year. Months in this year has next days:")
//            for (month in ordinaryYear.keys) {
//                var days = ordinaryYear[month]
//                println("$month: $days.")
//            }
        }

