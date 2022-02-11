abstract class Empoyee(  val name: String,
                         var age: Int,
                         var hourRate: Double ){

        abstract fun salary (hours: Double):Double
        override fun toString(): String {
            return ("name: $name age: $age hourRate: $hourRate")
        }

    fun getSallery(hours: Double): Double{
        return hours * hourRate
    }

}

class Manager(name: String, age: Int, hourRate: Double): Empoyee(name, age, hourRate) {
    override fun salary(hours: Double): Double {
        return hours * hourRate
    }

}

class Clerck(name: String, age: Int, hourRate: Double): Empoyee(name, age, hourRate) {
    override fun salary(hours: Double): Double {
        return (hours * hourRate / 2)
    }
}

data class Customer(var name: String, var age: Int, var gender: Gender){
    override fun equals(other: Any?): Boolean {
        return ((this.name == (other as Customer).name) &&
                (this.age == (other).age) &&
                (this.gender == (other).gender))
    }
}

enum class Gender{
    MALE, FEMALE
}
fun main(){

    val manager1 = Manager("Ali", 52, 104.0)
    val clerck1 = Clerck("Sama", 26, 110.0)
    val manager2 = Manager("Reza", 42, 120.0)
    val manager3 = Manager("Farhad", 34, 120.0)
    val hours  = arrayListOf(140,150,130,180)
    val customer1 = Customer("Sara", 22, Gender.FEMALE)
    val customer2 = Customer("Maryam", 30, Gender.FEMALE)

    val managers = listOf(manager1, manager2, manager3 )
    println(customer1 == customer2)
    println(clerck1.salary(7.2))
    println(manager1.salary(10.2))
    println(manager2.salary(5.1))
    println(manager3.salary(6.5))

    println(maxAge(managers))
}


fun maxAge(managers: List<Manager>): Int{
    var maxx = 0
    for (manager in managers){
        if (manager.age > maxx)
            maxx = manager.age
    }
    return  maxx
   // managers.maxByOrNull { manager -> manager.age }

}
//var maxAge = { managers -> managers.age }
