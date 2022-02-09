class List<T> (var array: ArrayList<T>)

fun main(){
    val list1 = List(arrayListOf(1, 2, 3, 4, 5))
    list1.slice(2)

    val list2 = List(arrayListOf("a","b","c","d","e","f","g"))
    list2.slice(3)
}

fun <T>List<T>.slice (n: Int) {
    println(array.take(n + 1))
    println(array.takeLast( array.size - n - 1))
}

