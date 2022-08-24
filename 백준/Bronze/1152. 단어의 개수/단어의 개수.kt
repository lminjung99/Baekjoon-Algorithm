fun main(){
    var string = readLine()
    var count = 0
    var arr = string!!.split(" ")
    for(i in 0 until (arr.size)){

        if(arr[i]=="") continue
        else count++
    }
    println(count)

}