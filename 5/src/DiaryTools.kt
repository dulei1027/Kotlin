//日记生成器，接受参数是地点，返回值是日记的内容
fun diaryGenerater(placeName:String):String{
    var temple = """
        今天天气晴朗，万里无云，我们去${placeName}游玩
        首先映入眼帘的是，${placeName}${placeName.length}个鎏金大字
        """
    return temple
}
fun main(args:Array<String>){
    var placeName = diaryGenerater("南京中山")
    println(placeName)
    placeName = diaryGenerater("黄海森林公园")
    println(placeName)
    placeName = diaryGenerater("韩国")
    println(placeName)
}