package strings
import java.lang.StringBuilder

fun <T> joinToString(
    collection:Collection<T>,
    separator:String =", ",
    prefix:String ="",
    postfix:String=""):String{
    val result = StringBuilder(prefix)
    for((index,element) in collection.withIndex()){
        if(index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun String.lastChar(): Char = this.get(this.length-1) //this -> 수신 객체(빼고도 작동함) String.lastChar -> 수신 객체 타입

fun main(args: Array<String>){
    val (key2,value) = 1 to "aa"
    println( key2)
    val list = listOf(1,2,3)
    println(list)
    println(joinToString(list, separator = ";", prefix = "(", postfix = ")"))
    println("laasdwdawd".lastChar())
}