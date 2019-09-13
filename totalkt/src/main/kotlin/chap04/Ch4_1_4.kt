package chap04

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

var myBool = false
val myVal: String = "hello"
    get() {
        if(myBool)
            return field
        else
            return field.toUpperCase()
    }

fun main(args: Array<String>) {
    println(myVal)
    myBool=true
    print(myVal)

}

const val myConst: Int = 10
// const var myConst2: Int = 10 // var 에 사용해서 에러

class MyClass {
    // const val myConst3 = 30 // const 가 전역이 아니어서 에러

    object A{
        const val myConst4=40
    }
}
fun some(){
    // const val myConst4= 40 // 지역변수에 const 가 할당되서 에러
}


