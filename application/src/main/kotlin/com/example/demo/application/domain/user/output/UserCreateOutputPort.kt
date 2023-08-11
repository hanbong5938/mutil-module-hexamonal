package com.example.demo.application.domain.user.output

import com.example.demo.application.domain.user.command.UserCreateCommand
import com.example.demo.domain.user.entity.User

fun interface UserCreateOutputPort {
    fun create(command: UserCreateCommand): User
}
