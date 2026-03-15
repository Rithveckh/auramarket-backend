package com.auramarket_backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "carbon_routes")
public class CarbonRoute {

    @Id
    private String id;

    private String productId;

    private String fromLocation;
    private String toLocation;

    private Double distanceKm;
    private String transportType;

    private Double co2Emission;

    public CarbonRoute(){}

    public String getId(){return id;}
    public void setId(String id){this.id=id;}

    public String getProductId(){return productId;}
    public void setProductId(String productId){this.productId=productId;}

    public String getFromLocation(){return fromLocation;}
    public void setFromLocation(String fromLocation){this.fromLocation=fromLocation;}

    public String getToLocation(){return toLocation;}
    public void setToLocation(String toLocation){this.toLocation=toLocation;}

    public Double getDistanceKm(){return distanceKm;}
    public void setDistanceKm(Double distanceKm){this.distanceKm=distanceKm;}

    public String getTransportType(){return transportType;}
    public void setTransportType(String transportType){this.transportType=transportType;}

    public Double getCo2Emission(){return co2Emission;}
    public void setCo2Emission(Double co2Emission){this.co2Emission=co2Emission;}

}