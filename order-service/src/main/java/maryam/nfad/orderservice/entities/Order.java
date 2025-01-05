package maryam.nfad.orderservice.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

import java.time.LocalDate;
import java.util.List;
@Entity
@NoArgsConstructor  @AllArgsConstructor @Getter @Setter @Builder @ToString
@Table(name = "ORDERS")
public class Order {
    @Id
    private String id;
    private LocalDate date;
    @Enumerated(EnumType.STRING)
    private OrderState state;
    @OneToMany(mappedBy = "order")
    private List<ProductItem> productItems;

}
