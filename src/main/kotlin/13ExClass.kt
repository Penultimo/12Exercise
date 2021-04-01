fun main(args: Array<String>) {
    var finished = false
    do{
        println("Please input the number")
        var input = readLine()?:"0"
        var number = input.toInt()
        if(number > 100){
            println("Thanks!")
            finished = true
        } else {
            println("$number is not greater than 100")

        }
    } while (!finished)

}