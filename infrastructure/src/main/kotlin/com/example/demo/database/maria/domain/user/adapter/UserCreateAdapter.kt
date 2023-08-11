package com.example.demo.database.maria.domain.user.adapter

import com.example.demo.application.user.command.UserCreateCommand
import com.example.demo.application.user.output.UserCreateOutputPort
import com.example.demo.database.maria.domain.user.entity.UserEntity
import com.example.demo.database.maria.domain.user.repository.UserRepository
import com.example.demo.user.entity.User
import org.springframework.stereotype.Component

@Component
class UserCreateAdapter(private val userRepository: UserRepository) : UserCreateOutputPort {
    override fun create(command: UserCreateCommand): User {
        val userEntity: UserEntity = userRepository.save(UserEntity.from(command.toUser()))
        return userEntity.toDomain()
    }
}
