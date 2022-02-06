import kotlin.math.round

class Exchenging(){

    fun toBainery(num: Int){
        var temp = num
        var sum = 0
        var k = 1
        while (temp > 0) {
            val b = temp % 2
            temp /= 2
            //println(temp)
            sum += k * b
            k *= 10
        }
        println("your number to bainery : " + sum  )
    }


    fun toBainery(num: Double){
        var temp = num
        var sum = 0.0
        var k = 0.1
        var count = 0
        while (doublePart(temp) > 0) {
            //println("temp : $temp")
            temp = doublePart(temp)
            val b = round(temp)
            //println("b : $b")
            temp *= 2
            sum += k * b
            k /= 10
            //println("sum: " + sum)
            //println("temp : $temp")
            count++
        }
        //println(count)
        count *= -1
        val result = Math.pow(10.toDouble(), (count).toDouble())
        println("your number to " + sum + (temp * result))
    }


    fun toDesimal(num: Int): Int{
        var sum = num
        var r = sum % 10
        var p = r
        var i = 2
        sum = sum / 10
        while (sum > 0) {
            r = sum % 10
            p = p + r * i
            sum = sum / 10
            i = i * 2
        }
        return p
    }

}


fun doublePart(num: Double): Double{
    var s = num.toString()
    var m = s.split(".")
    return ("0." + m[1]).toDouble()
}
fun main(){
    val exchenging = Exchenging()
    exchenging.toBainery(12.25)
    //println(exchenging.toDesimal(111))

}
