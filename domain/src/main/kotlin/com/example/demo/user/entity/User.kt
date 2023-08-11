package com.example.demo.user.entity

import com.example.demo.user.enums.UserType
import com.example.demo.user.vo.Email
import com.example.demo.user.vo.Password

data class User(
    val id: Long,
    val name: String,
    val email: Email,
    val password: Password,
    val type: UserType
)
