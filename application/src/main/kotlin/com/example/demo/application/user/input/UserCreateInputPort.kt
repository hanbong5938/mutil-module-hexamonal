package com.example.demo.application.user.input

import com.example.demo.application.user.command.UserCreateCommand
import com.example.demo.application.user.output.UserCreateOutputPort
import com.example.demo.application.user.usecase.UserCreateUseCase
import com.example.demo.user.entity.User
import org.springframework.stereotype.Service

@Service
class UserCreateInputPort(
    private val userCreateOutputPort: UserCreateOutputPort
) : UserCreateUseCase {

    override fun create(command: UserCreateCommand): User {
        return userCreateOutputPort.create(command)
    }

}
