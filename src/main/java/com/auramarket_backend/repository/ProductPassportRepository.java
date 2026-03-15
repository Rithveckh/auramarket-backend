package com.auramarket_backend.repository;

import com.auramarket_backend.model.ProductPassport;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductPassportRepository extends MongoRepository<ProductPassport, String> {

    ProductPassport findByProductId(String productId);

}
