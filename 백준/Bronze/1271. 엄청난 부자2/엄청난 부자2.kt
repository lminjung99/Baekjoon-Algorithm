import java.math.BigInteger


fun main(){
    var array = readLine()!!.split(" ")
    var n = BigInteger(array[0])
    var m = BigInteger(array[1])
    println("${n/m}")
    println("${n%m}")
}


