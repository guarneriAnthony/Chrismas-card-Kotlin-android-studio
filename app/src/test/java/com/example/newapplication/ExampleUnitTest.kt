package com.example.newapplication

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
        assertEquals(4, 2 + 2)
    }
    @Test
    fun generates_number(){
        val dice =Dice(6)
        val rollResult = dice.roll()
        assertTrue("Not in 1 and 6", rollResult in 1..6)
    }
}