package com.example.demo.application.domain.user.input

import com.example.demo.application.domain.user.command.UserCreateCommand
import com.example.demo.application.domain.user.output.UserCreateOutputPort
import com.example.demo.application.domain.user.usecase.UserCreateUseCase
import com.example.demo.domain.user.entity.User
import org.springframework.stereotype.Service

@Service
class UserCreateInputPort(
    private val userCreateOutputPort: UserCreateOutputPort
) : UserCreateUseCase {

    override fun create(command: UserCreateCommand): User {
        return userCreateOutputPort.create(command)
    }

}
