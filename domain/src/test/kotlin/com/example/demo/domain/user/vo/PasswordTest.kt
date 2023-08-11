package com.example.demo.domain.user.vo

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Test

class PasswordTest {

    @Test
    fun getValue() {
        val value = "1234"
        val password = Password(value)

        assertEquals(value, password.value)
        assertNotEquals("12345", password.value)

    }
}
