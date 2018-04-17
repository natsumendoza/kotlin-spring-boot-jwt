package com.auth0.samples.kotlinspringboot.controller

import com.auth0.samples.kotlinspringboot.model.ApplicationUser
import com.auth0.samples.kotlinspringboot.persistence.ApplicationUserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/sign-up")
class SignUpController (val applicationUserRepository: ApplicationUserRepository,
						val bCryptPasswordEncoder: BCryptPasswordEncoder) {

	@PostMapping
	fun signUp(@RequestBody applicationUser: ApplicationUser) {
		applicationUser.password = bCryptPasswordEncoder.encode(applicationUser.password)

		applicationUserRepository.save(applicationUser)
	}

}
