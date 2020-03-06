data class Gril(var name:String,var age:Int,var height:Int,var address:String)

var 非诚勿扰数据库 = listOf<Gril>(
    Gril("dulei1",23,167,"江苏"),
    Gril("dulei2",19,166,"江苏"),
    Gril("dulei3",33,166,"云南"),
    Gril("dulei4",33,166,"江苏"),
    Gril("dulei5",21,167,"山东"),
    Gril("dulei6",23,166,"安徽"),
    Gril("dulei7",23,167,"北京"),
    Gril("dulei8",23,167,"北京"),
    Gril("dulei9",39,167,"浙江"),
    Gril("dule10",23,167,"福建"),
    Gril("dule11",23,167,"广东"),
    Gril("dule12",21,169,"广东"),
    Gril("dule13",23,167,"安徽"),
    Gril("dule14",33,167,"河南"),
    Gril("dule15",20,165,"安徽"),
    Gril("dule16",23,164,"山西"),
    Gril("dule17",33,167,"台湾"),
    Gril("dule18",24,167,"香港"),
    Gril("dule19",33,167,"江苏"),
    Gril("dule20",21,166,"江苏"),
    Gril("dule21",23,164,"江苏"),
    Gril("dule22",30,167,"浙江"),
    Gril("dule23",33,164,"辽宁"),
    Gril("dule24",33,167,"山东")
)


fun filter(address:String){
    var 某地区的妹子 =ArrayList<Gril>()
    for(girl in 非诚勿扰数据库){
        if(girl.address == address){
            某地区的妹子.add(girl)
        }
    }

    for(girl in 某地区的妹子){
        println("${girl.address} ${girl.age} 岁的美女 名字叫 ${girl.name}")
    }
}


fun findAgeGirl(age:Int){
    var 某年纪的妹子 =ArrayList<Gril>()
    for(girl in 非诚勿扰数据库){
        if(girl.age < age){
            某年纪的妹子.add(girl)
        }
    }

    for(girl in 某年纪的妹子){
        println("${girl.address} ${girl.age} 岁的美女 名字叫 ${girl.name}")
    }
}

fun findAddressHeightAge(address: String,height: Int,age: Int){
    var 符合条件的妹子 =ArrayList<Gril>()
    for(girl in 非诚勿扰数据库){
        if((girl.age < age) and (girl.height > height) and(girl.address == address)){
            符合条件的妹子.add(girl)
        }
    }

    for(girl in 符合条件的妹子){
        println("${girl.address} ${girl.age} 岁的美女 名字叫 ${girl.name}")
    }
}