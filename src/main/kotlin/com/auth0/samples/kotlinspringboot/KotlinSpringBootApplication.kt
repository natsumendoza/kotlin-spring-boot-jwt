package com.auth0.samples.kotlinspringboot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
@EnableAutoConfiguration
open class KotlinSpringBootApplication
fun main(args: Array<String>) {
	SpringApplication.run(KotlinSpringBootApplication::class.java, *args)
}
