package com.example.kotlinapp.test2021

import org.junit.Test

import org.junit.Assert.*
import java.util.*

/**
 * Example local unit test, which will execute on the development machine (host).
724. 寻找数组的中心索引
 */
class LeetCode0128 {
    @Test
    fun test() {
        println(pivotIndex(intArrayOf(1,7,3,6,5,6)))
    }

    fun pivotIndex(nums: IntArray): Int {
        var total =  Arrays.stream(nums).sum()
        var sum = 0
        for (i in nums.indices){
            if (2 * sum + nums[i] == total) {
                return i
            }
            sum += nums[i]
        }
        return -1
    }
}