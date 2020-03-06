fun gradeStudent(grade:Int){
    when(grade){
        10 -> println("非常棒，666")
        9 -> println("干的不错")
        8 -> println("还行")
        7 -> println("可以的")
        else -> println("还需要再加油呀")
    }
}

fun main(args:Array<String>) {
    gradeStudent(9)
    gradeStudent(3)
}