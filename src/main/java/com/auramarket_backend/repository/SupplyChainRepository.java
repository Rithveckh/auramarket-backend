package com.auramarket_backend.repository;

import com.auramarket_backend.model.SupplyChain;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupplyChainRepository extends MongoRepository<SupplyChain, String> {

    List<SupplyChain> findByProductId(String productId);

}