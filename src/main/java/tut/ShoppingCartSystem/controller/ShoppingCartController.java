package tut.ShoppingCartSystem.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tut.ShoppingCartSystem.model.Cart;
import tut.ShoppingCartSystem.service.ShoppingCartService;

import java.util.List;

@RestController
@RequestMapping("/api/cart")
public class ShoppingCartController {
    @Autowired
    private ShoppingCartService shoppingCartService;

    // Add a product to the cart
    @PostMapping("/add/{productId}")
    public Cart addProductToCart(@PathVariable Long productId, @RequestParam int quantity) {
        return shoppingCartService.addProductToCart(productId, quantity);
    }

    // View all products in the cart
    @GetMapping("/items")
    public List<Cart> getAllItemsInCart() {
        return shoppingCartService.getAllItemsInCart();
    }

    // Update the quantity of a product in the cart
    @PutMapping("/update/{cartId}")
    public Cart updateProductQuantity(@PathVariable Long cartId, @RequestParam int quantity) {
        return shoppingCartService.updateProductQuantity(cartId, quantity);
    }

    // Remove a product from the cart
    @DeleteMapping("/remove/{cartId}")
    public void removeProductFromCart(@PathVariable Long cartId) {
        shoppingCartService.removeProductFromCart(cartId);
    }
}
