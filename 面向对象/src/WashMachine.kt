/**
 * 程序员 A 创建的洗衣机
 */
class WashMachine (var module:String,var size:Int)
{
    fun openDoor(){
    println("打开洗衣机的门 ...")
    }
    fun closeDoor(){
        println("关上洗衣机的门 ...")
    }
    fun start(){
        println("放水啦 ...")
        println("水放满了...")
        println("电机开始转了...")
        println("洗好了...")
    }
}