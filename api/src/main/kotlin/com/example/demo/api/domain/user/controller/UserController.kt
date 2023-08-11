package com.example.demo.api.domain.user.controller

import com.example.demo.api.domain.user.dto.UserCreateDto
import com.example.demo.application.domain.user.usecase.UserCreateUseCase
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController("/users")
class UserController(
    private val userCreateUseCase: UserCreateUseCase
) {

    @PostMapping("/create")
    fun create(
        @RequestBody request: UserCreateDto
    ) {
        userCreateUseCase.create(request.toCommand())
    }
}
