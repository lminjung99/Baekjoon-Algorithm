import java.util.*

fun main(){
//    var input = readLine()
//    var arr = input!!.trim().split(" ")
//    arr.forEach {
//        it.toInt()
//    }
    val sc:Scanner = Scanner(System.`in`)
    var a = sc.nextInt()
    var b = sc.nextInt()

    when{
        a>b->println(">")
        a<b->println("<")
        a==b->println("==")
    }
}