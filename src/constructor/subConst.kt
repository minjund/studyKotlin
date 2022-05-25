package constructor

import javax.naming.Context
import javax.swing.text.AttributeSet
import javax.swing.text.View

open class subConst {
    constructor(ctx: Context){ //부 생성자1

    }
    constructor(ctx: Context,attr:AttributeSet) { //부 생성자2

    }
}

class Mybtn : subConst{
    constructor(ctx: Context):super(ctx){ //부 생성자는 다른 생성자에게 생성을 위임하여야한다

    }

    constructor(ctx: Context,attr:AttributeSet):super(ctx,attr){

    }
}