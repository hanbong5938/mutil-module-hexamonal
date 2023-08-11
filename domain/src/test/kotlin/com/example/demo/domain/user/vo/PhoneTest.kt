package com.example.demo.domain.user.vo

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Test

class PhoneTest {

    @Test
    fun getNumber() {
        val value = "010-1234-5678"
        val phone = Phone(value)

        assertEquals(value, phone.number)
        assertNotEquals("010-1234-5679", phone.number)
    }
}
