import java.util.*

val sc: Scanner = Scanner(System.`in`)

fun newString(num:Int, str: CharArray){
    for((idx, i) in str.indices.withIndex()){
        if(idx==0)continue
        for(i in 0 until num){
            print(str[idx])
        }
    }
    println()

}

fun repeatInput(num: Int){
    for(i in 0 until num){
        var repeat = sc.nextInt()
        var myArr = sc.nextLine()
        var newArr = myArr!!.toCharArray()
        newString(repeat!!, newArr)
    }
}

fun main(){

    var num = sc.nextInt()
    repeatInput(num!!)

}