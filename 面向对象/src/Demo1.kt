//矩形 长 宽
class  Rect(var height:Int,var width:Int)

fun main(args: Array<String>) {
    var rect01 = Rect(20,24)
    println("矩形的高度是 ： ${rect01.height}")
    println("矩形的宽度是 ： ${rect01.width}")
}