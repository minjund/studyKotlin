import java.lang.IllegalArgumentException

interface Expr
class Num(val value:Int) : Expr
class Sum(val left:Expr, val right: Expr) : Expr

fun main(args : Array<String>){
    println("hello World");
    val name = if(args.size < 0) args[0] else "Kotlin"
    println(name);

    println(max(1,2))
    print(eval(Sum(Sum(Num(1),Num(2)),Num(4))))
}
/* "is" = 변수 타입 검사 "as" 변수 타입 전환 */
fun eval(e:Expr) :Int = //리팩토링 된 소스
    //if 문을 사용
    /*if(e is Num){
        e.value
    }else if(e is Sum){
        eval(e.right) + eval(e.left) //스마트 캐스팅이 진행됨 (초록색으로 표시)
    }else {
        throw IllegalAccessException("Unkown expression")
    }*/
    //if -> when
    when(e) {
        is Num -> e.value
        is Sum -> eval(e.right) + eval(e.left)
        else -> throw IllegalArgumentException("Unknow expression")
    }

fun max(a: Int,b:Int):Int = if(a>b) a else b

