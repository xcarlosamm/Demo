package com.demo.app

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

        val stringLengthFunc: (String) -> Int = { input ->
            println("fun body")
            input.length
        }

        val stringLength: Int = stringLengthFunc("Android")


        println(stringLength)




        assertEquals(4, 2 + 2)
    }
}
