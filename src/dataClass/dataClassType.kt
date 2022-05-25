package dataClass

class dataClassType(val name:String,val postalCode:Int) { //hashcode도 오버라이딩해야함 -> equals를 사용하면 해쉬코드도 같아야하지만 이것을 어기는 함수가 됨
    override fun hashCode(): Int = name.hashCode()*31+postalCode

    fun copy(name:String = this.name, postalCode: Int = this.postalCode) = dataClassType(name,postalCode)
    override fun equals(other: Any?): Boolean {
        if(other ==null || other !is dataClassType) //타입을 검사함
            return false
        return name == other.name && postalCode == other.postalCode // 코틀린은 equals를 ==로 사용함

    }
    override fun toString() = "dataClassType(name=$name,postal=$postalCode)"
}
fun main() {
    val click =dataClassType("김민준",1233)//dataClass toString 사용
    val click2 =dataClassType("김민준2",1233)//dataClass toString 사용
    println(click)
    println(click == click2)
    val copyClass =dataClassType("김민준",1233)//dataClass toString 사용
    print(copyClass.copy(postalCode = 5000))

}

