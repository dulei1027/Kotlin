fun diaryGenerater(placeName:String){
    var temple = """
        今天天气晴朗，万里无云，我们去${placeName}游玩
        首先映入眼帘的是，${placeName}${numToChinese(placeName.length)}个鎏金大字
        """
    println(temple)
}
fun numToChinese(num:Int):String{
    var number = when(num){
        1 -> "一"
        2 -> "二"
        3 -> "三"
        4 -> "四"
        else -> "写的太多了，你需要"
    }
    return number
}
fun main(args:Array<String>) {
    diaryGenerater("东台")
    diaryGenerater("苏州北")
}