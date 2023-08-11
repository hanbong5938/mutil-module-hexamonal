package com.example.demo.database.maria.domain.user.adapter

import com.example.demo.application.user.command.UserCreateCommand
import com.example.demo.database.maria.domain.user.entity.UserEntity
import com.example.demo.database.maria.domain.user.repository.UserRepository
import com.example.demo.user.entity.User
import com.example.demo.user.enums.UserType
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.ArgumentMatchers.any
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.jupiter.MockitoExtension


@ExtendWith(MockitoExtension::class)
class UserCreateAdapterTest {


    @Mock
    private lateinit var userRepository: UserRepository

    private lateinit var userCreateAdapter: UserCreateAdapter

    @BeforeEach
    fun setup() {
        userCreateAdapter = UserCreateAdapter(userRepository)
    }

    @Test
    fun create() {
        val command = UserCreateCommand("test", "test", "test", UserType.USER)
        val exppectUserEntity = UserEntity.from(
            User(
                id = 1L,
                name = command.name,
                email = command.email,
                password = command.password,
                type = command.type
            )
        )

        `when`(userRepository.save(any(UserEntity::class.java))).thenReturn(exppectUserEntity)

        val user: User = userCreateAdapter.create(command)

        assertEquals(command.name, user.name)
        assertEquals(command.email, user.email)
        assertEquals(command.password, user.password)
        assertEquals(command.type, user.type)
        assertNotNull(user.id)
    }
}
