package com.example.demo.domain.user.vo

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Test

class EmailTest {

    @Test
    fun getValue() {
        val value = "example@test.com"
        val email = Email(value = value)

        assertEquals(value, email.value)
        assertNotEquals("test", email.value)
    }
}
