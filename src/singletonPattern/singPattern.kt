package singletonPattern

import java.io.File

 object comparator : Comparator<File>{
   override fun compare(file1:File,file2:File):Int{
       return file1.path.compareTo(file2.path,ignoreCase = true)
   }
}
class singPattern {
 companion object { // 동반 객체 선언
     fun bar(){
         println("awdawd")
     }
 }
}