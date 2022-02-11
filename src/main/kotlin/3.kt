class BiggerOne<T>() {
    fun compare(a: Int, b: Int): Int{
        if (a > b)
            return a
        else if (a < b)
            return b
        else
            return a
    }

    fun compare(a: Double, b: Double): Double{
        if (a > b)
            return a
        else if (a < b)
            return b
        else
            return a
    }

    fun compare(a: String, b: String): String{
        if (a > b)
            return a
        else if (a < b)
            return b
        else
            return a
    }

    fun compare(a: Char, b: Char): Char{
        if (a > b)
            return a
        else if (a < b)
            return b
        else
            return a
    }

    fun compare(a: Float, b: Float): Float{
        if (a > b)
            return a
        else if (a < b)
            return b
        else
            return a
    }
}

fun main() {
    val biggerOne1 = BiggerOne<Int>()
    println(biggerOne1.compare(1, 5))

    val biggerOne2 = BiggerOne<Double>()
    println(biggerOne2.compare(10.1, 5.02))

    val biggerOne = BiggerOne<String>()
    println(biggerOne.compare("dd", "aa"))
}
