//接受一个参数 参数是非空的 String 类型 加上问号 ？ 代表参数可以为空
fun heat(str:String?):String{
    return "热" + str
}
fun main(args:Array<String>) {
    var result1 = heat("狗")
    println(result1)
    result1 = heat("水")
    println(result1)
    result1 = heat(null)
    println(result1)
}