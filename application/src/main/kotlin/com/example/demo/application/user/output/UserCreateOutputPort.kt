package com.example.demo.application.user.output

import com.example.demo.application.user.command.UserCreateCommand
import com.example.demo.user.entity.User

interface UserCreateOutputPort {
    fun create(command: UserCreateCommand): User
}
