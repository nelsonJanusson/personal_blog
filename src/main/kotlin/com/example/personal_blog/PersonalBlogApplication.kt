package com.example.personal_blog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PersonalBlogApplication

fun main(args: Array<String>) {
    runApplication<PersonalBlogApplication>(*args)
}
