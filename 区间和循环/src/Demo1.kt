fun main(args:Array<String>) {
    var nums = 1 .. 100
    var result = 0
    for(num in nums){
        result = result + num
    }
    print("结果是 :" + result)
}