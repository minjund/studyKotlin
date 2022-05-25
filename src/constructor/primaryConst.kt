package constructor

class primaryConst(val nickname:String,val isSubscr:Boolean = true) { //주 생성자

}

fun main(args:Array<String>) {
    val hyun = primaryConst("dd",true);
    println(hyun.isSubscr);
    println(hyun.nickname);

}