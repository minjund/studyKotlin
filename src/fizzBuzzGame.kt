
fun main(args : Array<String>){
    for(i in 1..100) { //아래에서 위로
       // println(fiizBuzz(i))
    }
    for(i in 100 downTo 1 step 2) { //위에서 아래로 2개씩 증가
        println(fiizBuzz(i))
    }
}

fun fiizBuzz(i:Int) = when{
     i % 15 == 0 -> "FizzBuzz"
     i % 3 == 0 -> "Fizz"
     i % 5 == 0 -> "Buzz"
     else -> "$i"
}