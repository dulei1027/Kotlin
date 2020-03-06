//请编写函数，函数名为 sayhello
//方法返回值是 String 类型，一个参数是 String 类型名称发是name

fun sayhello(name:String):String{
   return "hello" + name
}

//请编写函数，函数名为 checkage
//方法的返回值是 Boolean 类型，一个参数是整数类型 名称为 age
fun checkage(age:Int):Boolean{
    if(age > 18) return true else return false
}

//请编写函数，函数名为 savelog
//方法没有返回值 一个参数是整数类型 名称是 loglevel
fun savelog(logLevel:Int){

}

fun main(args:Array<String>){
   var result = sayhello("dulei")
    println(result)
    println(checkage(19))
}