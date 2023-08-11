package com.example.demo.domain.user.entity

import com.example.demo.domain.user.enums.UserType
import com.example.demo.domain.user.vo.Email
import com.example.demo.domain.user.vo.Password

data class User(
    val id: Long?,
    val name: String,
    val email: Email,
    val password: Password,
    val type: UserType
) {
    constructor(name: String, email: Email, password: Password, type: UserType) : this(
        null,
        name,
        email,
        password,
        type
    )

}
