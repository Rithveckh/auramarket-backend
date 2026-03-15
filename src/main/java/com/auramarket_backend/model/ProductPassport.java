package com.auramarket_backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product_passports")
public class ProductPassport {

    @Id
    private String id;

    private String productId;

    private String materialComposition;
    private String recyclability;
    private String repairabilityScore;
    private String warrantyPeriod;

    private String energyConsumption;
    private String carbonFootprint;

    private String manufacturerCertificate;
    private String complianceCertificates;

    public ProductPassport() {}

    public String getId() { return id; }

    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }

    public String getMaterialComposition() { return materialComposition; }
    public void setMaterialComposition(String materialComposition) { this.materialComposition = materialComposition; }

    public String getRecyclability() { return recyclability; }
    public void setRecyclability(String recyclability) { this.recyclability = recyclability; }

    public String getRepairabilityScore() { return repairabilityScore; }
    public void setRepairabilityScore(String repairabilityScore) { this.repairabilityScore = repairabilityScore; }

    public String getWarrantyPeriod() { return warrantyPeriod; }
    public void setWarrantyPeriod(String warrantyPeriod) { this.warrantyPeriod = warrantyPeriod; }

    public String getEnergyConsumption() { return energyConsumption; }
    public void setEnergyConsumption(String energyConsumption) { this.energyConsumption = energyConsumption; }

    public String getCarbonFootprint() { return carbonFootprint; }
    public void setCarbonFootprint(String carbonFootprint) { this.carbonFootprint = carbonFootprint; }

    public String getManufacturerCertificate() { return manufacturerCertificate; }
    public void setManufacturerCertificate(String manufacturerCertificate) { this.manufacturerCertificate = manufacturerCertificate; }

    public String getComplianceCertificates() { return complianceCertificates; }
    public void setComplianceCertificates(String complianceCertificates) { this.complianceCertificates = complianceCertificates; }
}
