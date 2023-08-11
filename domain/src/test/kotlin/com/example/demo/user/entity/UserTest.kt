package com.example.demo.user.entity

import com.example.demo.user.enums.UserType
import com.example.demo.user.vo.Email
import com.example.demo.user.vo.Password
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class UserTest {

    @Test
    fun create() {
        val emailValue = "demo@example.com"
        val email = Email(emailValue)
        val passwordValue = "password"
        val password = Password(passwordValue)
        val user = User(
            id = 1,
            name = "test",
            email = email,
            password = password,
            type = UserType.ADMIN
        )

        assertEquals(1, user.id)
        assertEquals("test", user.name)
        assertEquals(emailValue, user.email.value)
        assertEquals(passwordValue, user.password.value)
        assertEquals(UserType.ADMIN, user.type)
    }
}
