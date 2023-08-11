package com.example.demo.user.vo

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class EmailTest {

    @Test
    fun getValue() {
        val value = "example@test.com"
        val email = Email(value = value)

        assertEquals(value, email.value)
        assertNotEquals("test", email.value)
    }
}
