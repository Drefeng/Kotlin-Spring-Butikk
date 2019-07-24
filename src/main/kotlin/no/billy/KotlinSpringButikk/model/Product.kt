package no.billy.KotlinSpringButikk.model

import java.time.LocalDateTime
import javax.persistence.*

@Entity
data class Product(
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        val id: Int,
        val name: String,
        val price: Int,
        val addedOn: LocalDateTime
)