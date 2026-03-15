package com.auramarket_backend.controller;

import com.auramarket_backend.model.ProductPassport;
import com.auramarket_backend.repository.ProductPassportRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/passport")
@CrossOrigin
public class ProductPassportController {

    @Autowired
    private ProductPassportRepository repo;

    @PostMapping
    public ProductPassport createPassport(@RequestBody ProductPassport passport) {
        return repo.save(passport);
    }

    @GetMapping("/{productId}")
    public ProductPassport getPassport(@PathVariable String productId) {
        return repo.findByProductId(productId);
    }

    @PutMapping("/{productId}")
    public ProductPassport updatePassport(
            @PathVariable String productId,
            @RequestBody ProductPassport passport) {

        ProductPassport existing = repo.findByProductId(productId);

        if(existing != null){
            existing.setMaterialComposition(passport.getMaterialComposition());
            existing.setRecyclability(passport.getRecyclability());
            existing.setRepairabilityScore(passport.getRepairabilityScore());
            existing.setWarrantyPeriod(passport.getWarrantyPeriod());
            existing.setEnergyConsumption(passport.getEnergyConsumption());
            existing.setCarbonFootprint(passport.getCarbonFootprint());
            existing.setManufacturerCertificate(passport.getManufacturerCertificate());
            existing.setComplianceCertificates(passport.getComplianceCertificates());

            return repo.save(existing);
        }

        return null;
    }

}
