package com.auramarket_backend.service;

import org.springframework.stereotype.Service;

@Service
public class CarbonService {

    public double getEmissionFactor(String transport){

        switch(transport){

            case "ship": return 0.015;
            case "truck": return 0.12;
            case "air": return 0.60;
            default: return 0.1;

        }

    }

    public double calculate(double distance,double weight,String transport){

        double factor=getEmissionFactor(transport);

        return distance*weight*factor;

    }

}
