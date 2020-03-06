fun main(args:Array<String>){
    var str1 = "dulei"
    var str2 = "dulei"

    println(str1 == str2)
    println(str1.equals(str2))

    var str3 = "dulei"
    var str4 = "Dulei"
    println(str1.equals(str2))
    //第二个参数 true 代表忽略大小写
    println(str1.equals(str2,true))
}