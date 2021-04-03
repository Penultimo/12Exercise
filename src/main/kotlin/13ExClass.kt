fun main(args: Array<String>) {
   for(i in 1..3){
       userfunction()
   }
}

fun userfunction(){
    println("Please enter your name")
    var inputName = readLine()?:""
    var name = inputName.toString()
    println("Please enter your age")
    var input2 = readLine()?:""
    var age = input2.toInt()
    println("Hello, $name. You are $age years old.")
}



