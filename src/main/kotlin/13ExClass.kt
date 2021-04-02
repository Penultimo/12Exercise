fun main(args: Array<String>) {
        println("Please input the number which factorial is less than 3 000 000")
        do{
        var finished = false
        var input = readLine() ?: "0"
        var number = input.toInt()
        var result = 1L
        var index = 1
        while(index < number) {
                result *= index
                index++
        }
        println(result)
        if(result < 3000000) {
                finished = true
                println("Factorial of $input is $result. It is LESS than 3 000 000. Thanks")
        }
            else {println("Factorial of $input is $result. It is MORE than 3 000 000. Please enter another number")}

    }while(!finished)

}
