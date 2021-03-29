fun main(args: Array<String>) {
    println("Please input a number")
    var input = readLine()?:"0"
    var number = input.toInt()
    var index = 1
    while(index < number){
        val result = index * index++
//        println(result)
    }

}
