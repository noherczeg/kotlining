package com.example

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class HelloServiceTest {
    @InjectMocks
    lateinit var helloService: HelloService

    @Test
    fun testGreeting() {
        val result = helloService.greet()
        assertNotNull(result)
        assertEquals("hello world", result)
    }
}
