package lamda

//람다란 간단하게 이야기해서 값 처럼 여기저기 전달 할 수 있는 동작의 모음
data class Person(val name:String,val age:Int)

fun main(args:Array<String>) {
    val people = listOf(Person("민준",24), Person("길동",544))
    println(people.maxByOrNull { it.age })
    val sum ={x:Int,y:Int->x+y}
    println(sum(1,2))
}