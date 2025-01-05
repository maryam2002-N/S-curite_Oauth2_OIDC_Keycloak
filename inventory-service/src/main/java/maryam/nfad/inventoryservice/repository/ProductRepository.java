package maryam.nfad.inventoryservice.repository;

import maryam.nfad.inventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
