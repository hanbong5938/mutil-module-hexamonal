package com.example.demo.application.domain.user.command

import com.example.demo.domain.user.entity.User
import com.example.demo.domain.user.enums.UserType
import com.example.demo.domain.user.vo.Email
import com.example.demo.domain.user.vo.Password

data class UserCreateCommand(
    var name: String,
    var email: Email,
    var password: Password,
    var type: UserType
) {
    fun toUser(): User {
        return User(
            name = name,
            email = email,
            password = password,
            type = type
        )
    }

    constructor(name: String, email: String, password: String, userType: UserType) : this(
        name = name,
        email = Email(email),
        password = Password(password),
        type = userType
    )

}
