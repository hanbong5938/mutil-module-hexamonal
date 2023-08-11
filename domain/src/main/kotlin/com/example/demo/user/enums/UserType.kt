package com.example.demo.user.enums

enum class UserType {
    ADMIN,
    USER;

    fun isAdmin() = this == ADMIN

    fun isUser() = this == USER
}
