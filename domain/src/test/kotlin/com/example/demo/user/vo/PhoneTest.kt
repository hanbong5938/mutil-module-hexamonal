package com.example.demo.user.vo

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class PhoneTest {

    @Test
    fun getNumber() {
        val value = "010-1234-5678"
        val phone = Phone(value)

        assertEquals(value, phone.number)
        assertNotEquals("010-1234-5679", phone.number)
    }
}
