class BiggerOne<T>(var num1:T, var num2: T){

    fun compare(): T{
        if (num1.hashCode() < num2.hashCode())
            return num2
        else
            return num1
    }

    fun <T: Comparable<T>> sort(list: List<T>): List<T> {
        return list.sorted()
    }
}
fun main(){
    val biggerOne = BiggerOne("sss", 120)
    println(biggerOne.compare())
}
