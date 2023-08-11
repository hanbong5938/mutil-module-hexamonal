package com.example.demo.api.domain.user.dto

import com.example.demo.application.domain.user.command.UserCreateCommand
import com.example.demo.domain.user.enums.UserType

data class UserCreateDto(
    val name: String,
    val email: String,
    val password: String,
    val type: UserType = UserType.USER,
) {
    init {
        require(name.isNotBlank()) { "name must not be blank" }
        require(email.isNotBlank()) { "email must not be blank" }
        require(password.isNotBlank()) { "password must not be blank" }
    }

    fun toCommand(): UserCreateCommand = UserCreateCommand(
        name,
        email,
        password,
        type,
    )

}
