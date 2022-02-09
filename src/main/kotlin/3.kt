class BiggerOne<T>(var num1: T, var num2: T) {

    fun compare(): T {
        return num1
    }
}


fun main() {
    //val biggerOne = BiggerOne("1", 120)
    // println(biggerOne.compare())
    println()

    val o1: Any = 2
    val o2: Any = 4
    if (o1 is Comparable<*> && o1::class == o2::class) {
        @Suppress("UNCHECKED_CAST")
        if (o1 as Comparable<Any> < o2) {
            println("it's less")
        }
    }
}

class Generic<T : Any>(val klass: Class<T>) {
    companion object {
        inline operator fun <reified T : Any>invoke() = Generic(T::class.java)
    }

    fun checkType(t: Any) {
        when {
            klass.isAssignableFrom(t.javaClass) -> true
            else -> false
        }

    }
}
