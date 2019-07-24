package no.billy.KotlinSpringButikk.model

import com.sun.org.apache.xpath.internal.operations.Bool
import java.time.LocalDateTime
import javax.persistence.*

@Entity
data class Order(
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        val id: Int,
        var delivered: Bool,
        val placedOn: LocalDateTime,
        var deliveredOn: LocalDateTime
)