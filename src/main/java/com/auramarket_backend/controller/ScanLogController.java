package com.auramarket_backend.controller;

import com.auramarket_backend.model.ScanLog;
import com.auramarket_backend.repository.ScanLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/scan")
public class ScanLogController {

    @Autowired
    private ScanLogRepository scanLogRepository;

    // Log a new scan event
    @PostMapping
    public ScanLog logScan(@RequestBody ScanLog scanLog) {
        return scanLogRepository.save(scanLog);
    }

    // Get scans for a specific product
    @GetMapping("/{productId}")
    public List<ScanLog> getProductScans(@PathVariable String productId) {
        return scanLogRepository.findByProductId(productId);
    }

    // Get all scan logs
    @GetMapping
    public List<ScanLog> getAllScans() {
        return scanLogRepository.findAll();
    }
}