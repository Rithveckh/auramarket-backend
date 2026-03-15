package com.auramarket_backend.controller;

import com.auramarket_backend.model.CarbonRoute;
import com.auramarket_backend.repository.CarbonRouteRepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carbon")
@CrossOrigin("*")
public class CarbonController {

    private final CarbonRouteRepository repo;

    public CarbonController(CarbonRouteRepository repo){

        this.repo=repo;

    }

    @PostMapping
    public CarbonRoute addRoute(@RequestBody CarbonRoute route){

        return repo.save(route);

    }

    @GetMapping("/{productId}")
    public List<CarbonRoute> getRoutes(@PathVariable String productId){

        return repo.findByProductId(productId);

    }

}
