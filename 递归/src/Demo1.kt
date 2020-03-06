import java.math.BigInteger

fun main(arg:Array<String>) {
    var num = BigInteger("1")
    println(fuct(num))
}

fun fuct(num:BigInteger):BigInteger{
    if(num == BigInteger.ONE){
        return BigInteger.ONE
    }else{
        return num *fuct(num-BigInteger.ONE)
    }
}