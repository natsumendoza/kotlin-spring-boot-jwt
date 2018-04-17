package com.auth0.samples.kotlinspringboot.persistence

import com.auth0.samples.kotlinspringboot.model.Customer
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository : CrudRepository<Customer, Long>
