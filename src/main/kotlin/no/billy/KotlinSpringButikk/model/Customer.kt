package no.billy.KotlinSpringButikk.model

import java.time.LocalDateTime
import javax.persistence.*

@Entity
data class Customer(
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        val id: Int,
        val name: String,
        val address: String,
        val email: String,
        val createdOn: LocalDateTime,
        var lastLogin: LocalDateTime
)
