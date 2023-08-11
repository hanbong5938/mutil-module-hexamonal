package com.example.demo.database.maria.domain.user.repository

import com.example.demo.database.maria.domain.user.entity.UserEntity
import com.example.demo.database.maria.domain.user.repository.custom.UserRepositoryCustom
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<UserEntity, Long>, UserRepositoryCustom
