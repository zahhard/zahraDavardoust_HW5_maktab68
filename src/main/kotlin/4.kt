fun <T>print(arrayList: ArrayList<T>) {
    for (element in arrayList){
        print(element.toString() + ", ")
    }
}

fun main(){
    print(arrayListOf("sara", "sanam", 222, 5.26))
}