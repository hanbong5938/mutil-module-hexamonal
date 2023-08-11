package com.example.demo.application.user.usecase

import com.example.demo.application.user.command.UserCreateCommand
import com.example.demo.user.entity.User

fun interface UserCreateUseCase {
    fun create(command: UserCreateCommand): User
}
