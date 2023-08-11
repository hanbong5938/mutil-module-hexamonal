package com.example.demo.user.enums

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class UserTypeTest {

    @Test
    fun isAdmin() {
        val admin = UserType.ADMIN
        val user = UserType.USER

        assertTrue(admin.isAdmin())
        assertFalse(user.isAdmin())
    }

    @Test
    fun isUser() {
        val admin = UserType.ADMIN
        val user = UserType.USER

        assertFalse(admin.isUser())
        assertTrue(user.isUser())
    }

    @Test
    fun values() {
        val values = UserType.values()

        assertEquals(2, values.size)
    }

    @Test
    fun valueOf() {
        val admin = UserType.valueOf("ADMIN")
        val user = UserType.valueOf("USER")

        assertEquals(UserType.ADMIN, admin)
        assertNotEquals(UserType.USER, admin)
        assertEquals(UserType.USER, user)
        assertNotEquals(UserType.ADMIN, user)
    }
}
