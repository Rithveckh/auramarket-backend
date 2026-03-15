package com.auramarket_backend.repository;

import com.auramarket_backend.model.ScanLog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScanLogRepository extends MongoRepository<ScanLog, String> {

    List<ScanLog> findByProductId(String productId);

}