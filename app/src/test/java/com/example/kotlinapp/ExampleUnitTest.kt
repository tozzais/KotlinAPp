package com.example.kotlinapp

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        isContainsName("123","1234")
    }


    fun isContainsName(callbackMethod: String, name: String) {
       val has = true
       val javaScript = "javascript:$callbackMethod('${has.toString()}')"
        println(javaScript)
    }
}