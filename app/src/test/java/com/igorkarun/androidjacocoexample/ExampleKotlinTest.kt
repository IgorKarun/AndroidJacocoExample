package com.igorkarun.androidjacocoexample

import org.junit.Assert
import org.junit.Test

class ExampleKotlinTest {

    @Test
    fun testAddition() {
        Assert.assertEquals(4, ExampleKotlin().addition(2, 2))
    }
}