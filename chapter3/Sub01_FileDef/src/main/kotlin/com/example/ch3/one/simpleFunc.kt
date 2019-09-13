package com.example.ch3.one

var sum = 0

fun calSum(){
    for( i in 1..10){
        sum += i
    }
}

fun main(){
    calSum()
    println(sum)
}