package com.auth0.samples.kotlinspringboot.controller

import com.auth0.samples.kotlinspringboot.model.Customer
import com.auth0.samples.kotlinspringboot.persistence.CustomerRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/customers")
class CustomerController (val repository: CustomerRepository) {

	@GetMapping
	fun findAll() = repository.findAll()

	@PostMapping
	fun addCustomer(@RequestBody customer: Customer) =
			repository.save(customer)

	@PutMapping("/{id}")
	fun updateCustomer(@PathVariable id: Long, @RequestBody customer: Customer) {
		assert(customer.id == id)
		repository.save(customer)
	}

	@DeleteMapping("{id}")
	fun removeCustomer(@PathVariable id: Long) =
			repository.delete(id)

	fun getById(@PathVariable id: Long) =
			repository.findOne(id)

}
