package com.example.demo.user.vo

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class PasswordTest {

    @Test
    fun getValue() {
        val value = "1234"
        val password = Password(value)

        assertEquals(value, password.value)
        assertNotEquals("12345", password.value)

    }
}
