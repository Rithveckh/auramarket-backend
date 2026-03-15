package com.auramarket_backend.repository;

import com.auramarket_backend.model.CarbonRoute;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CarbonRouteRepository extends MongoRepository<CarbonRoute,String>{

    List<CarbonRoute> findByProductId(String productId);

}
