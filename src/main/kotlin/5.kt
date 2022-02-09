fun main(){
    val list1 = listOf(1, 2, 3, 4, 5)
    list1.slice(2)

    val list2 = listOf("a","b","c","d","e","f","g")
    list2.slice(3)
}

fun <T>List<T>.slice (n: Int) {

    println(this.take(n + 1))
    println(this.takeLast( this.size - n - 1))
}

