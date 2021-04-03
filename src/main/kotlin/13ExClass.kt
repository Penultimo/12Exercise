fun main(args: Array<String>) {
    var onlyEvenNumber = arrayListOf(2, 4, 6, 8, 9, 11, 12)
    for(number in onlyEvenNumber){
        if(number %2 !=0) break
        println("Half of $number is ${number / 2}")
    }

}
