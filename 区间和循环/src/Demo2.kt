fun main(args:Array<String>) {
    var num2 = 1 until 100   //[1,100)   左闭环右开环
//    for(num in num2){
//        println(num)
//    }

    var num3 = num2.reversed()   //reversed  倒序打印
//    for(num in num3){
//        println(num)
//    }

    var num4 = 1 .. 27
    for(num in  num4 step 2){   //step 每次 加 对应的值 打印
        println(num)
    }

    println("num4 的总数" + num4.count())
}