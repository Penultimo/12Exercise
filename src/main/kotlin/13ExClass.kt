fun main(args: Array<String>) {
    println("Please input a number")
    var input = readLine() ?: "0"
    var number = input.toInt()
    var i = 0
    while(i < number) {
        if (i % 7 == 0)
            println("$i is divisible by 7")
            i++


    }
}