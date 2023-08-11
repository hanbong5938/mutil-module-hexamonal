package com.example.demo.database.maria.domain.user.entity

import com.example.demo.user.entity.User
import com.example.demo.user.enums.UserType
import com.example.demo.user.vo.Email
import com.example.demo.user.vo.Password
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test

class UserEntityTest {

    @Test
    fun from() {
        val user = User(
            id = 1L,
            name = "name",
            email = Email("email"),
            password = Password("password"),
            type = UserType.USER
        )

        val user2 = User(
            null,
            name = "name2",
            email = Email("email2"),
            password = Password("password2"),
            type = UserType.ADMIN
        )
        val userEntity: UserEntity = UserEntity.from(user)
        val userEntity2: UserEntity = UserEntity.from(user2)
        assertEquals(user.id, userEntity.id)
        assertEquals(user.name, userEntity.name)
        assertEquals(user.email.value, userEntity.email)
        assertEquals(user.password.value, userEntity.password)
        assertEquals(user.type, userEntity.type)

        assertNull(user2.id)
        assertNull(userEntity2.id)
        assertEquals(user2.name, userEntity2.name)
        assertEquals(user2.email.value, userEntity2.email)
        assertEquals(user2.password.value, userEntity2.password)
        assertEquals(user2.type, userEntity2.type)
    }

    @Test
    fun toDomain() {
        val user = User(
            id = 1L,
            name = "name",
            email = Email("email"),
            password = Password("password"),
            type = UserType.USER
        )

        val userEntity: UserEntity = UserEntity.from(user)
        val domain: User = userEntity.toDomain()

        assertEquals(userEntity.id, domain.id)
        assertEquals(userEntity.name, domain.name)
        assertEquals(userEntity.email, domain.email.value)
        assertEquals(userEntity.password, domain.password.value)
        assertEquals(userEntity.type, domain.type)
    }
}
