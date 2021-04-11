package com.exercise.client

import com.exercise.hello.sayHi


fun getName(){
    println("Please enter your name")
    var input = readLine()?:""
    var clientName = input.toString()
    sayHi(clientName)
}
