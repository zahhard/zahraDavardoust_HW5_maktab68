fun main() {

    var count1 = 0
    var count2 = 0
    var count3 = 0
    var count4 = 0
    var n = 5;
    println("Your input is: $n")
    count1++

    for (i in 0 until n) {
        println("Your output is $i")
        count2++
    }
    for (i in 0 until  n) {
        for (j in 0 until  n) {
            println("Your output is $i and $j")
            count3++
        }
    }

    for (i in 0 until  factorial(n)) {
        println("Your output is $i")
        count4++
    }

    witchOne(count1)
    witchOne(count2)
    witchOne(count3)
    witchOne(count4)
}

fun factorial(n: Int): Int {
    var fact = 2
    for (i in 3..n) {
        fact *= i
    }
    return fact
}

fun witchOne(count: Int, n: Int = 5){
    if (count == n) {
        println("O(n)    *   $count")
    }
    else if (count == factorial(n)) {
        println("O(n!)   *   $count")
    }
    else if (count == n * n) {
        println("O(n^2)  *   $count")
    }
    else{
        println("O(1)    *   $count")
    }



}