import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException

fun main(args : Array<String>){
    val reader = BufferedReader(StringReader("233"))
    println(readNumber(reader))
}

fun readNumber(reader : BufferedReader): Int? {
    val number = try {
        val line = reader.readLine();
        return Integer.parseInt(line)
    }catch (e: NumberFormatException){
        return null
    }finally {
        reader.close()
    }

}