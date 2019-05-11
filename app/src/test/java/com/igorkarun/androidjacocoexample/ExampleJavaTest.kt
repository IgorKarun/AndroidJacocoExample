package com.igorkarun.androidjacocoexample

import org.junit.Assert.assertEquals
import org.junit.Test

class ExampleJavaTest {

    @Test
    fun testMultiplication() {
        assertEquals(4, ExampleJava.multiplication(2, 2))
    }
}