import java.util.*
import kotlin.collections.HashMap

fun main(){
    var word = readLine()
    //var arr = word!!.toUpperCase().toCharArray()
    var arr = word!!.toUpperCase().toList()
    var arr2 = arr.toSet().toCharArray().toHashSet()
    var hashMap = HashMap<Char, Int>()

    arr2.forEach {
        var count = 0
        for(i in arr.indices){
            if(it == arr[i]){
                hashMap[it] = ++count
            }
        }
    }

    var max = Collections.max(hashMap.values)
    var check = 0
    var answer : Char = ' '
    hashMap.forEach {

        if(it.value==max){
            check++
            answer = it.key
        }
    }
    if(check>1){
        answer = '?'
    }
    println(answer)
    
}