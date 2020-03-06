fun main(args:Array<String>) {
    var a = 8
    var b = 2
    println("a + b = " +plus(a,b))
    println("a - b =" +delete(a,b))
    println("a * b =" +mult(a,b))
    println("a / b =" +devide(a,b))
}
//fun 是固定写法 plus 是函数名称（a 是第一参数，类型 Int）：Int  返回值类型是 Int 类型
fun plus(a:Int,b:Int):Int{
    return a + b
}
fun delete(a:Int,b:Int):Int{
    return a - b
}
fun mult(a:Int,b:Int):Int{
    return a * b
}
fun devide(a:Int,b:Int):Int{
    return a / b
}