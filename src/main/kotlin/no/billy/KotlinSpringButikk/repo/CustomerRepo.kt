package no.billy.KotlinSpringButikk.repo

import no.billy.KotlinSpringButikk.model.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepo : JpaRepository<Customer, Int> {

}