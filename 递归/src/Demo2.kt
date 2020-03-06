fun main(args:Array<String>) {
    println(odd(5,0))
}

tailrec  fun odd(num:Int,result:Int):Int{
    println("已经执行了" + num )
    if(num == 1){
        return  1
    }else{
        return odd(num-1,result+num)
    }
}