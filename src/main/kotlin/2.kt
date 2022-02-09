abstract class Empoyee(){}

class Manage(): Empoyee() {}

class Clerck(): Empoyee() {}

data class Customer(var name: String, var age: Int, var gender: Gender){}

enum class Gender{
    MALE, FEMALE
}