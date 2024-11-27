package tut.ShoppingCartSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tut.ShoppingCartSystem.model.Cart;
import tut.ShoppingCartSystem.model.Product;
import tut.ShoppingCartSystem.repository.CartRepository;
import tut.ShoppingCartSystem.repository.ProductRepository;

import java.util.List;
@Service

public class ShoppingCartService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CartRepository cartRepository;

    // Add a product to the cart
    public Cart addProductToCart(Long productId, int quantity) {
        Product product = productRepository.findById(productId).orElseThrow(() -> new RuntimeException("Product not found"));
        Cart cart = new Cart();
        cart.setProduct(product);
        cart.setQuantity(quantity);
        return cartRepository.save(cart);
    }

    // View all products in the cart
    public List<Cart> getAllItemsInCart() {
        return cartRepository.findAll();
    }

    // Update the quantity of a product in the cart
    public Cart updateProductQuantity(Long cartId, int newQuantity) {
        Cart cart = cartRepository.findById(cartId).orElseThrow(() -> new RuntimeException("Cart item not found"));
        cart.setQuantity(newQuantity);
        return cartRepository.save(cart);
    }

    // Remove a product from the cart
    public void removeProductFromCart(Long cartId) {
        cartRepository.deleteById(cartId);
    }
}
