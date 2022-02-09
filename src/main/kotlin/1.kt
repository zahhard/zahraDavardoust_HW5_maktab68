object Garage{
    var cars = ArrayList<Any>()
    fun sortBySpeed(cars: ArrayList<PublicTrasportationVehicle>){
        for (i in cars.indices){
            for (j in cars.indices){

            }
        }
    }
}
interface PublicTrasportationVehicle{
    fun maxSpeed(): Int
    fun maxCapacity()
}

interface ServiceTrasportationVehicle {
    fun maxSpeed(): Int
    fun maxCapacity()
}

interface PrivateTrasportationVehicle {
    fun maxSpeed(): Int
    fun maxCapacity()
}

class Taxi(var maxSpeed: Int, var maxCapacity: Int) : PublicTrasportationVehicle{
    override fun maxSpeed(): Int {
        return maxSpeed
    }

    override fun maxCapacity() {
        println(maxCapacity)
    }
}

class Bus(var maxSpeed: Int, var maxCapacity: Int) : PublicTrasportationVehicle{
    override fun maxSpeed(): Int {
        return maxSpeed
    }

    override fun maxCapacity() {
        println(maxCapacity)
    }
}

class Ambulance(var maxSpeed: Int, var maxCapacity: Int) : ServiceTrasportationVehicle{
    override fun maxSpeed(): Int {
        return maxSpeed
    }

    override fun maxCapacity() {
        println(maxCapacity)
    }
}

class Truck(var maxSpeed: Int, var maxCapacity: Int) : ServiceTrasportationVehicle{
    override fun maxSpeed(): Int {
        return maxSpeed
    }

    override fun maxCapacity() {
        println(maxCapacity)
    }
}

class Car(var maxSpeed: Int, var maxCapacity: Int) : PrivateTrasportationVehicle{
    override fun maxSpeed(): Int {
        return maxSpeed
    }

    override fun maxCapacity() {
        println(maxCapacity)
    }
}

class Van(var maxSpeed: Int, var maxCapacity: Int) : PrivateTrasportationVehicle{
    override fun maxSpeed(): Int {
        return maxSpeed
    }

    override fun maxCapacity() {
        println(maxCapacity)
    }
}

fun main(){
    val final = ArrayList<Any>()
    val taxi = Taxi(120, 5)
    val bus = Bus(90, 50)
    val ambulance = Ambulance(130, 6)
    val truck =Truck(60, 2)
    val car = Car(210, 4)
    var van = Van(150, 11)
    final.add(taxi)
    final.add(bus)
    final.add(ambulance)
    final.add(truck)
    final.add(car)
    final.add(van)


}

