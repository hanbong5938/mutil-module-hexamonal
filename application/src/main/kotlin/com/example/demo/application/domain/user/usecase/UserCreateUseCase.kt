package com.example.demo.application.domain.user.usecase

import com.example.demo.application.domain.user.command.UserCreateCommand
import com.example.demo.domain.user.entity.User

fun interface UserCreateUseCase {
    fun create(command: UserCreateCommand): User
}
