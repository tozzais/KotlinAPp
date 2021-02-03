package com.example.kotlinapp

fun main(array: Array<String>) {
//    println("hello world")
////    Greeter("zhangsan").add(1,2,3,4,5,6,7)
//
//    val sumLambda: (Int, Int) -> Int = {x,y -> x+y}
//    println(sumLambda(1,1))

//    var a = 1
//// 模板中的简单名称：
//    val s1 = "a is $a"
//    a = 2
//// 模板中的任意表达式：
//    val s2 = "${s1.replace("is", "was")}, but now is $a"


    //类型后面加?表示可为空
//    var age: String? = "23"
//    age = null
////抛出空指针异常
//    val ages = age!!.toInt()
////不做处理返回 null
//    val ages1 = age?.toInt()
////age为空返回-1
//    val ages2 = age?.toInt() ?: -1
//    println(ages1)

//    java基本数据类型：byte1 boolean1 short2 char2 float4 int4  long8 double8
//    kotlin基本数据类型：byte1 short2  float4 int4  long8 double8

//    val a = 10000
//    println(a === a) // true，值相等，对象地址相等
//
//    //经过了装箱，创建了两个不同的对象
//    val boxedA: Int? = a
//    val anotherBoxedA: Int? = a
//
//    //虽然经过了装箱，但是值是相等的，都是10000
//    println(boxedA === anotherBoxedA) //  false，值相等，对象地址不一样
//    println(boxedA == anotherBoxedA) // true，值相等


//    var  b1:Byte = 1
//    var a1:Int = b1.toInt()
//
//    //[1,2,3]
//    val a2 = arrayOf(1, 2, 3)
//    //[0,2,4]
//    val b = Array(3) { i -> (i * 2) }
//
//    //读取数组内容
//    println(a2[0])    // 输出结果：1
//    println(b[1])    // 输出结果：2

//    val s = "runoob"
//    val str = "$s.length is ${s.length}" // 求值结果为 "runoob.length is 6"
//    println(str)

//    val price = """
//    ${'$'}9.99
//    """
//    println(price)
//
//    val arrayOf = arrayOf(1, 2, 3)

    val a = 1000
    when(a){
        !in 1..10 -> println("不在范围内")
        in 1..10000 -> println("在范围内")
    }


}
/* 单行注释 */
/*
多行注释
 */
class Greeter(var name:String){
    fun  greet(){
        println("hello,$name")
    }

    fun add(vararg  a:Int){
        for (i in a){
            println(i)
        }
    }

    var age = 0
    val nam = "12345"

}


