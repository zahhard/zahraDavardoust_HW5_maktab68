fun main(){


    var n = 5;
    println("Your input is: " + n);
    for (i in 0 until n) {
        println("Your output is " + i);
    }
    for (i in 0..n) {
        for(j in 0..n) {
        println("Your output is " + i + " and " + j);
    }
    }
    for  (i in 0.. factorial(n)){
        println("Your output is " + i);
    }
}

fun factorial(n: Int): Int{
    var fact = 2
    for (i in 3 until n){
        fact *= i
    }
    return fact
}
