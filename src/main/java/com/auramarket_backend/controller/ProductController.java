package com.auramarket_backend.controller;

import com.auramarket_backend.model.Product;
import com.auramarket_backend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:9000"})
@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductRepository repository;
    // Create new product
    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return repository.save(product);
    }

    // Get all products
    @GetMapping
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    // Get product by productId
    @GetMapping("/{productId}")
    public Product getProductByProductId(@PathVariable String productId) {
        return repository.findByProductId(productId);
    }

    @PutMapping("/{productId}")
    public Product updateProduct(
            @PathVariable String productId,
            @RequestBody Product updatedProduct) {

        Product existing = repository.findByProductId(productId);

        existing.setPrice(updatedProduct.getPrice());
        existing.setEcoScore(updatedProduct.getEcoScore());

        return repository.save(existing);
    }
}