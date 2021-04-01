fun main(args: Array<String>) {
    do{
        println("Please input the number")
        var input = readLine()?:"0"
        var number = input.toInt()
    } while (number <100)
}