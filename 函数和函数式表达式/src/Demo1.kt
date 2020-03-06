fun main(args:Array<String>) {
    var result1 = add(3,7)
    println(result1)
    //第一种写法
    var i ={x:Int,y:Int -> x+y}
    var result = i(3,7)
    println(result)
    //第二种写法
    var j:(Int,Int) ->Int ={x,y -> x + y}

    var result2 = j(3,7)
    println(result)
}

fun add(x:Int,y:Int):Int{
    return x + y
}