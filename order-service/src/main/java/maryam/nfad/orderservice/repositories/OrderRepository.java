package maryam.nfad.orderservice.repositories;

import maryam.nfad.orderservice.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,String> {
}
