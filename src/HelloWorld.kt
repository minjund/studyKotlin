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
fun eval(e:Expr) :Int {
    if(e is Num){
        val n = e as Num // 불필요한 중복 변환
        return n.value
    }
    if(e is Sum){
        return eval(e.right) + eval(e.left) //스마트 캐스팅이 진행됨 (초록색으로 표시)
    }
    throw IllegalAccessException("Unkown expression")
}

fun max(a: Int,b:Int):Int = if(a>b) a else b

