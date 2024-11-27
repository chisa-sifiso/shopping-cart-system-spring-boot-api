package tut.ShoppingCartSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tut.ShoppingCartSystem.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
