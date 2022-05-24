package interfaceClass

interface Clickable {
    fun click() //일반 메소드 선언
    fun showOff()= println("Clickable입니다") // 디폴트 구현이 있는 메소드 선언
}
interface focus{
    fun showOff() = println("focus 입니다.")
}