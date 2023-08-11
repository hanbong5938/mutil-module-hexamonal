package com.example.demo.application.config

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan(basePackages = ["com.example.demo.application.*.usecase"], lazyInit = true)
class ApplicationConfig
