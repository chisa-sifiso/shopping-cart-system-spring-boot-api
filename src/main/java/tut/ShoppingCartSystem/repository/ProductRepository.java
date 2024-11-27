package tut.ShoppingCartSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tut.ShoppingCartSystem.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
