fun main(args: Array<String>) {
    var i = 0
    var j = 0
    while(i <= 100){
        while (j <=100){
            print("$i, $j\t")
            j++
        }
        i++
        j=0
        println()
    }
}