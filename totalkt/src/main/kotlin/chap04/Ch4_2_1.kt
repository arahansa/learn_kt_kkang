package chap04

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun sum(a: Int, b: Int): Int {
    var sum=0
    fun calSum(){
        for(i in a..b){
            sum += i
        }
    }
    calSum()
    return sum
}

fun main(args: Array<String>) {
    val result=sum(1, 10)
    println(result)
}

fun some(a: Int, b: Int): Int{
    return a + b
}

fun sum1(a: Int, b: Int): Int{
    return a+b
}

// 리턴 타입 없다면 Unit
fun sumvoid(a: Int, b: Int): Unit{
    println(a+b)
}

// 리턴 타입 없어서 생략
fun sumvoid2(a: Int, b: Int){
    println(a+b)
}



fun some2(a: Int, b: Int): Int = a  + b

fun some3(a: Int, b: Int) = a  + b