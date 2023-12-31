package com.example.demo.domain.user.util

import com.example.demo.domain.user.vo.Email
import com.example.demo.domain.user.vo.Phone
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Test

class UserMaskingTest {

    @Test
    fun maskPhone() {
        val value = "01012345678"
        val phone = Phone(value)

        val result = UserMasking.maskPhone(phone)

        assertEquals("010*****678", result)
        assertNotEquals(value, result)
    }

    @Test
    fun maskEmail() {
        val value = "test@example.com"
        val email = Email(value)

        val result = UserMasking.maskEmail(email)

        assertEquals("t**t@example.com", result)
        assertNotEquals(value, result)
    }
}
