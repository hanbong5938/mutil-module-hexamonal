package com.example.demo.application.user.usecase

import com.example.demo.user.entity.User
import com.example.demo.application.user.command.UserCreateCommand

interface UserCreateUseCase {
    fun create(command: UserCreateCommand): User
}
