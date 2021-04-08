fun main (args: Array<String>){
    printHello()
}

fun printHello(){
    fun sayHi (name: String){
        println("Hi, $name, how are you?")
    }
    while(true){
        println("please enter a name")
        val name = readLine()?:""
        if (name == "") break
        sayHi(name)
    }
}