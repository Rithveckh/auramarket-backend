package com.auramarket_backend.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "products")
public class Product {

    @Id
    private String id;

    private String productId;

    private String name;

    private String brand;

    private String category;

    private String manufactureLocation;

    private String carbonFootprint;

    private String ecoScore;

    private String manualLink;

    private String price;
}