package no.billy.KotlinSpringButikk.model

import com.sun.org.apache.xpath.internal.operations.Bool
import java.time.LocalDateTime
import javax.persistence.*

@Entity
data class Order(
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        val id: Int,
        var isDelivered: Bool,
        val placedOn: LocalDateTime,
        var deliveredOn: LocalDateTime,
        @ManyToMany
        @JoinTable(name="order_product")
        val products: List<Product>
)