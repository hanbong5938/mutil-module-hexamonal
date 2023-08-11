package com.example.demo.database.maria.domain.user.entity

import com.example.demo.user.entity.User
import com.example.demo.user.enums.UserType
import com.example.demo.user.vo.Email
import com.example.demo.user.vo.Password
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity(name = "user")
data class UserEntity(
    @Id
    @Column(nullable = false) val id: Long?,
    val name: String,
    val email: String,
    val password: String,
    val type: UserType
) {
    companion object {
        fun from(user: User): UserEntity {
            return UserEntity(user)
        }
    }

    constructor() : this(0, "", "", "", UserType.USER)

    constructor(user: User) : this(
        id = user.id,
        name = user.name,
        email = user.email.value,
        password = user.password.value,
        type = user.type
    )

    fun toDomain(): User {
        return User(
            id = this.id,
            name = this.name,
            email = Email(this.email),
            password = Password(this.password),
            type = this.type
        )
    }

}
