package interfaceClass

class button : Clickable,focus {
    override fun click() { //override 사용이 필수
        println("i was Click")
    }
    override fun showOff() {
        super<Clickable>.showOff() // 인터페이스에 이름과 시그니처가 같은 멤버 메소드에 대해 둘 이상의 디폴트 구현이 있으면 명시 해줌
        super<focus>.showOff()
    }
}

fun main(args : Array<String>){
    val btn = button();
    btn.click()
    btn.showOff()
}