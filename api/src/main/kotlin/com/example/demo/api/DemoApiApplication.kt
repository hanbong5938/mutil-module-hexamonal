package com.example.demo.api

import com.example.demo.application.global.config.ApplicationConfig
import com.example.demo.database.maria.config.MariaConfig
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Import

@SpringBootApplication
@Import(
    value = [ApplicationConfig::class, MariaConfig::class]
)
@ConfigurationPropertiesScan
class DemoApiApplication

fun main(args: Array<String>) {
    runApplication<DemoApiApplication>(*args)
}
