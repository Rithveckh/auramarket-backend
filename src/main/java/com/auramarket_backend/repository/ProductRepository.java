package com.auramarket_backend.repository;

import com.auramarket_backend.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

    Product findByProductId(String productId);

}