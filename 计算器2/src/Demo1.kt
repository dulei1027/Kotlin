import java.lang.Exception

fun main(args:Array<String>) {
    while(true){
        println("请输入第一个数字");
        var num1str = readLine()
        println("请输入第二个数字");
        var num2str = readLine()
        try {
            var num1 = num1str!!.toInt()
            var num2 = num2str!!.toInt()
            println("${num1} ${num2} ${num1 + num2}");
        }catch (e : Exception){
            println("您好,您输入的数字有问题");
        }
    }
}
