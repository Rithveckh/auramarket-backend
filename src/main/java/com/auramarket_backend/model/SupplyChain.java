package com.auramarket_backend.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "supply_chain")
public class SupplyChain {

    @Id
    private String id;

    private String productId;

    private String stageName;

    private String location;

    private String timestamp;
}