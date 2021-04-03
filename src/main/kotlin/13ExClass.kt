fun main(args: Array<String>) {
    val usernames = hashSetOf("john", "bob", "alice")
    do{
        println("Please choose and write below your username:")
        var input = readLine()?:""
        var userName = input.toString()
        var finished =  false
        if(usernames.contains(userName)){
            println("This name $userName already is taken. Please choose another username.")

        } else{
            usernames.add(userName)
            println("Thanks for registration, $userName. Your name is added to the list of clients.")
            finished = true
            println(usernames)
        }

    }while(!finished)

}
