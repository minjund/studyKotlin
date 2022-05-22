import java.lang.IllegalArgumentException

class localFun (
    val id : Int,
    val name : String,
    val address : String
)
fun saveUser(user:localFun){
    fun validate(user:localFun,
                 value:String,
                 fieldName:String
    ){ // 로컬 함수로 인해 중복 체크 제거 (user,value)에 대한 중복 제거
        if(value.isEmpty()){
            throw IllegalArgumentException(
                "isEmpty"
            )
        }
    }
    validate(user,user.name,"Name")
}

fun main(args:Array<String>){
}