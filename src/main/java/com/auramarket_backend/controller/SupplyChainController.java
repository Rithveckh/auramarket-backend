package com.auramarket_backend.controller;

import com.auramarket_backend.model.SupplyChain;
import com.auramarket_backend.repository.SupplyChainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/supplychain")
public class SupplyChainController {

    @Autowired
    private SupplyChainRepository supplyChainRepository;

    // Add a new supply chain stage
    @PostMapping
    public SupplyChain addStage(@RequestBody SupplyChain stage) {
        return supplyChainRepository.save(stage);
    }

    // Get all supply chain stages for a product
    @GetMapping("/{productId}")
    public List<SupplyChain> getProductJourney(@PathVariable String productId) {
        return supplyChainRepository.findByProductId(productId);
    }

    // Get all stages in database
    @GetMapping
    public List<SupplyChain> getAllStages() {
        return supplyChainRepository.findAll();
    }
}